// 의존 객체 주입 자동화하기 - 생성자를 이용하여 의존 객체 주입
package bitcamp.java106.step08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam05 {

    public static void main(String[] args) {
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-05.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        /*
         Engine()   === > 생성자를 이용하여 의존객체 주입은 Engine()을 먼저 주입한다.
         Car4()
         
         Car [model=티코, maker=비트자동차, createdDate=null, auto=true, cc=890, engine=Engine [maker=비트자동차, valve=16, cylinder=4]] 
        */
        
        
        
    }
}





