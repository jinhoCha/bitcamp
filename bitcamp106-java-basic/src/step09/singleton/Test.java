
//Singleton 패턴
// => 객체를 한개만 생성할 수 있게 만드는 설계 방법
package step09.singleton;

public class Test {
    public static void main(String[] args) {
        // Singleton을 적용하지 않은 클래스의 인스턴스 만들기
        
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
        
        System.out.println("----------------------");
        
      //  Car2 c1 = new Car2(); //컴파일 오류
        Car2 x1 = Car2.getInstance();
        Car2 x2 = Car2.getInstance();
        Car2 x3 = Car2.getInstance();
        if (x1 == x2) System.out.println("x1 == x2");
        if (x2 == x3) System.out.println("x2 == x3");
    }
}
