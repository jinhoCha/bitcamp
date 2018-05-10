// 의존 객체 주입 자동화하기 - 같은 타입의 의존 객체가 여러개 있을 떄; @Qualifier 애노테이션
package bitcamp.java106.step08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam08 {

    public static void main(String[] args) {
        // => @Qualifier 애노테이션을 처리할 BeanPostProcessor
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-08.xml");
        
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





