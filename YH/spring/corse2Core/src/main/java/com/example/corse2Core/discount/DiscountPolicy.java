package com.example.corse2Core.discount;

import com.example.corse2Core.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
