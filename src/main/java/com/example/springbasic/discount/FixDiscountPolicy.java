package com.example.springbasic.discount;

import com.example.springbasic.member.Grade;
import com.example.springbasic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) { // enum 은 == 으로 비교
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
