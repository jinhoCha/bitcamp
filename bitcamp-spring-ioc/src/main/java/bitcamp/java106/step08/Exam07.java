// 의존 객체 주입 자동화하기 - 같은 타입의 의존 객체가 여러개 있을 떄; @Qualifier 애노테이션
package bitcamp.java106.step08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam07 {

    public static void main(String[] args) {
        // @Qualifier 애노테이션을 붙이면,
        // 같은 타입의 객체가 여러 개 있따 하더라도 그 중에 지정된 이름을 갖는 객체가 주입된다.
        // 그러나 막상 실행을 하면 Engine 객체가 여러 개 있다고 실행 오류가 발생한다.
        // 이유는 ?
        // =>Qualifier 애노테이션을 처리할 BeanPostProcessor가 없기 때문이다.
        // 해결책?
        // => @Qualifier 애노테이션을 처리할 BeanPostProcessor
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-07.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        System.out.println("--------------------------------------");
        
        BeanUtils.printBeanNames(iocContainer);
        /* 실행 결과
             Engine()
            Engine()
            Car [model=티코, maker=비트자동차, createdDate=null, auto=true, cc=890, engine=Engine [maker=캠프자동차, valve=32, cylinder=8]]
            --------------------------------------
            [생성된 빈의 이름 목록]
            org.springframework.context.annotation.internalConfigurationAnnotationProcessor
            org.springframework.context.annotation.internalAutowiredAnnotationProcessor
            org.springframework.context.annotation.internalRequiredAnnotationProcessor
            org.springframework.context.annotation.internalCommonAnnotationProcessor
            org.springframework.context.event.internalEventListenerProcessor
            org.springframework.context.event.internalEventListenerFactory
            c1
            e1
            e2
            -----------------------------------
        */
        
        
        
    }
}





