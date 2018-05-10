// 클래스를 이용하여 스프링 설정하기 - @configuration 애노테이션
package bitcamp.java106.step10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import bitcamp.java106.BeanUtils;

public class Exam02 {

    public static void main(String[] args) {
        // 패키지명을 지정하면
        // 해당 패키지의 모든 클래스를 찾아 @Component,@Service, @Controller, @Repository
        // 애노테이션이 붙은 클래스에 대해 객체를 자동생성한다.
        // 또한
        // @Configuration 애노테이션이 붙은 클래스를 찾아
        // 그 클래스에 @Bean 애노테이션이 붙은 메서드를 호출하여 그 리턴 값을 저장한다.
        ApplicationContext iocContainer = 
                new AnnotationConfigApplicationContext("bitcamp.java106.step10"); 
        
        BeanUtils.printBeanNames(iocContainer);
        
        /* 실행 결과.
       Engine()
        Car.setMaker()
        Car.setModel()
        Car.cc()
        Car.setAuto()
        [생성된 빈의 이름 목록]
        org.springframework.context.annotation.internalConfigurationAnnotationProcessor
        org.springframework.context.annotation.internalAutowiredAnnotationProcessor
        org.springframework.context.annotation.internalRequiredAnnotationProcessor
        org.springframework.context.annotation.internalCommonAnnotationProcessor
        org.springframework.context.event.internalEventListenerProcessor
        org.springframework.context.event.internalEventListenerFactory
        appConfig02    ==> @Configuration이 있어서 찾음
        car            ==> Car.class에   @Component 있어서 찾음
        engine         ==> Engine.class에 @Component 있어서 찾음
        Car2           ==> AppConfig01.calss에서 @Bean있는 부분찾음 car3는 없어서 못찾음 !! 중요
-----------------------------------
         */
    }
}





