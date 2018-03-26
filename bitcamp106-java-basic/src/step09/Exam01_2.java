//생성자 활용 예 - java.util.Date 클래스
package step09;

import java.util.Date;

public class Exam01_2 {

    public static void main(String[] args) {
        // java.util.Date 클래스는 날짜 데이터를 다루는 클래스이다.
        // => 이클래스에는 날짜 데이터를 다룰 수 있는 다양한 메서드가 들어 있다.
        
        Date d1 = new Date();
       System.out.println(d1);
       
       Date d2 = new Date(118, 2, 20);
       System.out.println(d2);
}
}
       