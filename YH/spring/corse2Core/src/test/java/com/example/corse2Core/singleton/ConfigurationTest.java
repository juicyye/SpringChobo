package com.example.corse2Core.singleton;

import com.example.corse2Core.AppConfig;
import com.example.corse2Core.member.MemberRepository;
import com.example.corse2Core.member.MemberService;
import com.example.corse2Core.member.MemberServiceImpl;
import com.example.corse2Core.order.OrderServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationTest {

    @Test
    void configurationTest(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);
        MemberRepository memberRepository = ac.getBean("memberRepository", MemberRepository.class);

        MemberRepository memberRepository1 = memberService.getMemberRepository();
        MemberRepository memberRepository2 = orderService.getMemberRepository();

        System.out.println("memberSerVice -> memberRepository1 = "+memberRepository1);
        System.out.println("orderSerVice -> memberRepository2 = "+memberRepository2);
        System.out.println("memberRepository = "+memberRepository);
    }

    @Test
    void configurationDeep(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean = "+bean.getClass());
    }
}
