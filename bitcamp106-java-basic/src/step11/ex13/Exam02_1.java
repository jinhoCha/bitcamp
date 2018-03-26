// 캡슐화(encapsulation) - 필요한 이유
package step11.ex13;

import step11.ex13.sub.B;
import step11.ex13.sub.C;

public class Exam02_1 extends C {
    
    public static void main(String[] args) {
       A obj1 = new A();
       
       //obj1.privateVar = 100; // 접근 불가 오직 그 클래스 안에서만 사용가능!!
       obj1.defaultVar = 100; // 사용가능 A와 Exam02_1클래스는 A와  같은 패키지에 소속되어 있다.
       obj1.protectedVar = 100; // 비록 이 클래스가 자식클래스는 아니지만 같은 패키지에 소속되어 있다.
       
       obj1.publicVar = 100; // OK 모두다 접근 가능!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   
       B obj2 = new B();
       
       // obj2.privateVar = 100; // 접근 불가 오직 그 클래스 안에서만 사용가능!!
       //obj2.defaultVar = 100; // 접근 불가 같은 패키지까지만 접근 가능.
       // obj2.protectedVar = 100; // 접근 불가 !! 같은 패키지 또는 자식 클래스 접근 가능
        obj2.publicVar = 100; //  ok 모두다 접근 가능!
        
        C obj3 = new C  ();

        // obj2.privateVar = 100; // 접근 불가 오직 그 클래스 안에서만 사용가능!!
        //obj2.defaultVar = 100; // 접근 불가 같은 패키지까지만 접근 가능.
         //obj2.protectedVar = 100; // 접근 불가 ! 같읕 패키지 또는 자식 클래스 접근 가능
                                  // 자식 클래스인데 접근 불가 ? ==> 이유 자기의 인스턴스 변수가 아니다.
         obj2.publicVar = 100; //  모두다 접근 가능
         
         Exam02_1 obj4 = new Exam02_1();
        // obj4.privateVar =100; // 접근 불가 c클래스에서만 접근 가능
        // obj4.defaultVar = 100; // 접근불가 C클래스와 같은 패키지가 아니다.
         obj4.protectedVar = 100; // OK Exam02_1는 자식 클래스이며 또한 C로부터 상속받아서 만든 자기변수이다.
       
    }
    
}


// PRIVATE : 클래스 안에서만 접근 가능
// (default) : private + 같은 패키지 소속
// protected : ( default) + 자식 클래스 자신의 만든 변수일 경우
//public : 모두 접근 가능

// 실무
// => 인스턴스 변수는 보통 private으로 선언한다. 접근을 제한한다.
// => 겟터,셋터 public으로 선언한다. 접근을 모두에게 공개한다.
// 일반 메서드도 public으로 접근을 모두에게 공개한다.
// => 그 클래스 내부에서만 사용되는 메서드는 private으로 접근을 제한한다.
// = > 자식 클래스의 접근을 허용할 필요가 있을 경우메나 protected로 만든다.
// 다른 개발자가 사용할 클래스 모음을 만들 때 
// 그 모읍집 내에서만 사용될 변수나 메서드인 경우 (default)로 접근을 제한한다
// 즉 라이브러리를 만드는 개바잘자 인 경우(default)를 사요하는 경우가 있다.


