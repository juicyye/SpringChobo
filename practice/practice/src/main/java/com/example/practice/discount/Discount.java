package com.example.practice.discount;

import com.example.practice.member.Member;

public interface Discount {
    int discountPolicy(Member member, int price);
}
