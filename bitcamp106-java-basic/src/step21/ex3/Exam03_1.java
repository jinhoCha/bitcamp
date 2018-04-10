// 던지는 예외를 메서드에 선언하기 - 모두 나열하기


package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam03_1 {

    //공통 분모를 사용하여 퉁치는 방법
    // => 메서드에서 발생하는 예외의 공통 수퍼 클래스를 지정하면 된다.
    static void m(int i) throws Exception {
        if (i == 0)
        throw new Exception();
        else if( i == 1)
            throw new RuntimeException();
        else if( i == 2)
            throw new SQLException();
        else 
            throw new IOException();
    }
    static void m2() {
        throw new Error();  // OK
    }
    
   
    public static void main(String[] args) {

        

    }

}
