package com.example.practice.order;

import com.example.practice.discount.Discount;
import com.example.practice.member.Member;
import com.example.practice.member.MemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    private final Discount discount;

    public OrderServiceImpl(MemberRepository memberRepository, Discount discount) {
        this.memberRepository = memberRepository;
        this.discount = discount;
    }

    @Override
    public Order createOrder(Long id, String itemName, int itemPrice) {
        Member member = memberRepository.findById(id);
        int discountPrice  = discount.discountPolicy(member,itemPrice);
        return new Order(id,itemName,itemPrice,discountPrice);
    }
}
