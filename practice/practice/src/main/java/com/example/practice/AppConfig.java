package com.example.practice;

import com.example.practice.discount.Discount;
import com.example.practice.discount.FixPrice;
import com.example.practice.member.MemberRepository;
import com.example.practice.member.MemberService;
import com.example.practice.member.MemberServiceImpl;
import com.example.practice.member.MemoryMemberRepository;
import com.example.practice.order.OrderService;
import com.example.practice.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public Discount discount(){
        return new FixPrice();
    }
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discount());
    }
}
