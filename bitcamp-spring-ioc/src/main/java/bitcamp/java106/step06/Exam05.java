//팩토리 메서드ㅡ FactoryBean구현체
package bitcamp.java106.step06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam05 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step06/application-context-05.xml");
        
        // 이 예제는 Exam04 예제와 같다.
        // 다만 Factory클래스의 이름을 CarFactorㅛ3에서 CarFctoryBean으로 바꾼것이다.
        System.out.println(iocContainer.getBean("c1"));
        
    }

}





