//생성자 활용 예 - java.util.Date 클래스
package step09;

import java.util.Date;

    private X() {
        Systme.out.pritnln();
    }
public class Exam01_4 {

    public static void main(String[] args) {

        X obj;
        
        //생성자의 접근이 막혀있기 떄문에 생성자를 호출할 수 없다
        // 따라사 new 명령으로 객체를 생상할수 없도록만든다.
        //obj = new X(); // 컴파일 오류!!
    }
}
       