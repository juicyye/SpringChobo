package com.example.corse2Core;

import com.example.corse2Core.discount.DiscountPolicy;
import com.example.corse2Core.discount.FixDiscountPolicy;
import com.example.corse2Core.member.MemberRepository;
import com.example.corse2Core.member.MemberService;
import com.example.corse2Core.member.MemberServiceImpl;
import com.example.corse2Core.member.MemoryMemberRepository;
import com.example.corse2Core.order.OrderService;
import com.example.corse2Core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        System.out.println("CALL AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository(){
        System.out.println("CALL AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() {
        System.out.println("CALL AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy(){
        System.out.println("CALL AppConfig.discountPolicy");
        return new FixDiscountPolicy();
    }
}
