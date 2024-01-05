package com.example.practice.discount;

import com.example.practice.member.Grade;
import com.example.practice.member.Member;

public class FixPrice implements Discount{
    private final int fixprice = 1000;
    @Override
    public int discountPolicy(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return fixprice;
        } else{
            return 0;
        }
    }
}
