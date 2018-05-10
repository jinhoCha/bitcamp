// 프로퍼티 에디터 - String ==> Engine ; 변환기 사용하여 처리하기.
package bitcamp.java106.step07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bitcamp.java106.BeanUtils;

public class Exam04 {

    public static void main(String[] args) {
        // @Autowired 애노테이션을 인스턴스 변수에 붙여도 된다.
        // => 그러면 의존 객체를 직접 변수에 주입한다.
        // => 셋터를 호출하지 않는다.                ----- 중요 !!!
        // 즉 셋터가 없어도 된다.
        // => 인스턴스 변수에 직접 의존 객체르 ㄹ주입한다는 것은
        // 캡슐화, 즉 외부에서 직접 인스턴스 변수에 접근하는 것을 막는 기법,를 위배하는 측면이 있기 때문에
        // 객체지향을 파괴하는 방식이라는 비난을 받는다.
        ApplicationContext iocContainer = new ClassPathXmlApplicationContext(
                "bitcamp/java106/step08/application-context-04.xml");
        
        System.out.println(iocContainer.getBean("c1"));
        /*
         Car3()
         Engine()
         // 여기에 셋터메서드가 호출되지 않는다.
         Car [model=티코, maker=비트자동차, createdDate=null, auto=true, cc=890, engine=Engine [maker=비트자동차, valve=16, cylinder=4]] */
        
        
        
    }
}





