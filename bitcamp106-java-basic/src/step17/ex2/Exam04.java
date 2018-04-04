
// 스태틱 맴버와 import

package step17.ex2;

//스태틱 맴버를 클래스 이름을 지정하지 않고 바로 사용하고 싶다면
// 다음과 같이 미리 해당 스태틱 맴버가 들어 있는 클래스를 컴파일러에게 알려줘라!
import static step17.ex2.Category2.*;
public class Exam04 {

    public static void main(String[] args) {
       Product2 p = new Product2();
    
       //  p.category = Category2.appliance.TV;
       // 위에서 import appliance와 book. computer 클래스가 포함되어있는
       // Category2
       //다음과 같이 클래스 이름을 생략하고 쓸 수 있다.
       p.category = appliance.TV;
       p.name = "울트라 비전 뷰";
       p.price = 2000000;

    }

}
