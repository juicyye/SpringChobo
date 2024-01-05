package com.example.practice.discount;

import com.example.practice.member.Grade;
import com.example.practice.member.Member;

public class RatePrice implements Discount{
    private final int rate= 10;
    @Override
    public int discountPolicy(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return price *10 / 100;
        } else{
            return 0;
        }
    }
}
