// 의존 객체 주입 자동화하기 - BeanPostProcessor 동작 원리
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam03 {

    public static void main(String[] args) {
        
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-03.xml");
        
        // Car 객체를 꺼내 Engine 객체가 주입되었는지 확인해보자!
        System.out.println(iocContainer.getBean("c1"));
        
        /* 실행결과
             MyBeanPostProcessor()
             Car2()           <--- application-context-03.xml에서 순서대로 작업을 실행한후 
             postProcessBeforeInitialization     <----- MyBeanPostProcessor
             postProcessAfterInitialization
             Engine()                            <-----
             postProcessBeforeInitialization
             postProcessAfterInitialization
             Car [model=티코, maker=비트자동차, createdDate=null, auto=true, cc=890, engine=null]
 */
    }
}





