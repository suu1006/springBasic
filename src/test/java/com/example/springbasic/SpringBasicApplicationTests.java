package com.example.springbasic;

import com.example.springbasic.member.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBasicApplicationTests {

    @Autowired
    ApplicationContext ac;

    @Test
    void contextLoads() {
        MemberRepository bean = ac.getBean(MemberRepository.class);
    }


}
