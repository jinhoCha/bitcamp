

//다형성 - 다형적 변수 (polymorphic variables)

package step11.ex09;

public class Exam01 {

    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        Bike b = new Bike();
        Car c = new Car();
        Sedan s = new Sedan();
        Truck t = new Truck();

        //레퍼런스는 같은 타입의 객체를 가질수 있음 뿐만 아니라
        // 그 클래스의 서브클래스 객체 까지 가리킬수 있따.
        //        /왜? 서브클래스는 항상 상위클래스의 ㅁ ㅗ든 것을 사용할 수가 있기 때문에.

        //다음 규칙에따라 , 다음v2 변수는 Vehicle 객체뿐만아니라
        // Bike,car,Truck 객체까지 다양한 서브클랫으ㅢ 객체를 가르킬 수 있다.
        //         그래서 v2fmf  "다형적 변수"의 기능을 갖고 있다 말한다.

        Vehicle v2 = null;
        v2 = b; //OK
        v2 = c; //OK
        v2 = s; //OK

        Bike b2 = null;
        // b2 = v; //컴파일오류
        // b2 = c;//컴파일오류
        // b2 = s;//컴파일오류
        // b2 = t; // 컴파일오류
        Car  c2 = null;
        //  c2 = v; //컴파일오류
        //  c2 = b; //컴파일오류
        c2 = s; //OK
        c2 = t; //OK

        Sedan s2 = null;
        //   s2 = v; //컴파일오류
        //  s2 = b; //컴파일오류
        //  s2 = c; //컴파일오류
        //  s2 = t; //컴파일오류
    }   

}
