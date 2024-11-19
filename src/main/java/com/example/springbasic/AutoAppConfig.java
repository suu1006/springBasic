package com.example.springbasic;

import com.example.springbasic.discount.DiscountPolicy;
import com.example.springbasic.member.MemberRepository;
import com.example.springbasic.member.MemoryMemberRepository;
import com.example.springbasic.order.OrderService;
import com.example.springbasic.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "com.example.springbasic",
        excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    @Bean(name="memoryMemberRepository")
//    MemberRepository memberRepository(){
//        return new MemoryMemberRepository();
//    }

}

