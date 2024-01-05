package com.example.corse2Core.discount;

import com.example.corse2Core.member.Grade;
import com.example.corse2Core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FixDiscountPolicy implements DiscountPolicy{

    private int disCountFixAmount = 1000; // 1000원 할인
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return disCountFixAmount;
        } else{
            return 0;
        }
    }
}
