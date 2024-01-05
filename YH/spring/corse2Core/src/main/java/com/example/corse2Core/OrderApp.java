package com.example.corse2Core;

import com.example.corse2Core.member.Grade;
import com.example.corse2Core.member.Member;
import com.example.corse2Core.member.MemberService;
import com.example.corse2Core.member.MemberServiceImpl;
import com.example.corse2Core.order.Order;
import com.example.corse2Core.order.OrderService;
import com.example.corse2Core.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);
        System.out.println("order = " +order.toString());
        System.out.println(order.calculatePrice());
    }
}
