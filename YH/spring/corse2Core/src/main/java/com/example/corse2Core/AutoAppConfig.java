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
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
