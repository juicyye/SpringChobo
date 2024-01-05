package com.example.corse2Core.discount;

import com.example.corse2Core.annotation.MainDiscountPolicy;
import com.example.corse2Core.member.Grade;
import com.example.corse2Core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{
    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return price * discountPercent/ 100;
        } else {
            return 0;
        }
    }
}
