package com.example.corse2Core.scope;

import com.example.corse2Core.lifecycle.BeanLifeCycleTest;
import com.example.corse2Core.lifecycle.NetworkClient;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class PrototypeTest {
    @Test
    void prototypeBeanFind(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(PrototypeBean.class);
        System.out.println("find prototypeBean1");
        PrototypeBean prototype1 = ac.getBean(PrototypeBean.class);
        System.out.println("find prototypeBean2");
        PrototypeBean prototype2 = ac.getBean(PrototypeBean.class);
        System.out.println("prototype1 = "+prototype1);
        System.out.println("prototype2 = "+prototype2);
        Assertions.assertThat(prototype1).isNotSameAs(prototype2);

        ac.close();

    }
    @Scope("prototype")
    static class PrototypeBean{
        @PostConstruct
        public void init(){
            System.out.println("SingletonBean.init");
        }

        @PreDestroy
        public void destroy(){
            System.out.println("SingletonBean.destroy");
        }
    }
}
