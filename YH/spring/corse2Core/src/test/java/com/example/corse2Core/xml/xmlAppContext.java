package com.example.corse2Core.xml;

import com.example.corse2Core.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class xmlAppContext {
    @Test
    void xmlAppContext(){
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService MemberService = ac.getBean("MemberService", MemberService.class);
        Assertions.assertThat(MemberService).isInstanceOf(MemberService.class);

    }
}
