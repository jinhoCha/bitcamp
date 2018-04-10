// 예외 처리 - RuntimeException


package step21.ex3;

import javax.management.RuntimeErrorException;

public class Exam02_2 {

 
// RuntimeException은 클래스 이름을 보더라도 Exception의 서브클래스이다.
    static void m() throws Throwable {
        throw new RuntimeException();
    }
    
    //Exception의 서브클래스임에도 불구하고
    static void m2() {
        throw new RuntimeException();  // OK
    }
    
    
    public static void main(String[] args) {

        

    }

}
