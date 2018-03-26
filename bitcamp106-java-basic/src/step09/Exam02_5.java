// 인스턴스  메서드와 클래스 매서드의 활용 - Calendar 클래스
package step09;

import java.util.Calendar;
import java.util.Date;

public class Exam02_5 {

    public static void main(String[] args) throws Exception {
        //Calendar 클래스의 생성자는 protected로 접근이 제한되어 있기 때문에
        // 다른패키지에서 직접 생성자를 호출할수가 없다.
        // Calendar c = new Calendar(); 오류오류오류오류
        
        // 오늘 날짜 및 시간 정보를 지정한 객체를 만들어 리턴한다.
        // 달력은 그레고리안 달력을 사용한다.
        Calendar c = Calendar.getInstance();
        
        //인스턴스 메서드 활용
        System.out.println(c.get(1));  //년도 2018이찍힘
        System.out.println(c.get(2) + 1); // 달 3월달이 찍힘
        System.out.println(c.get(5)); // 요일이 찍힘
        System.out.println(c.get(7)); // 1~7까지 요일이나타남 1은일요일 4는 수요일
        System.out.println(c.get(4)); // 그달에 몇번째주
        System.out.println(c.get(10)); // 시 (0 ~ 11)
        System.out.println(c.get(11)); // 시 24시간
        System.out.println(c.get(12)); //분
        System.out.println(c.get(13)); // 초
        
        //상수의 활용
        System.out.println(c.get(Calendar.YEAR));  //년도 2018이찍힘
        System.out.println(c.get(Calendar.MONTH) + 1); // 달 3월달이 찍힘
        System.out.println(c.get(Calendar.DATE)); // 요일이 찍힘
        System.out.println(c.get(Calendar.DAY_OF_WEEK)); // 1~7까지 요일이나타남 1은일요일 4는 수요일
        System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // 그달에 몇번째주
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        
        

        




    }
}
