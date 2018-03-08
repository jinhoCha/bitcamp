// 관계 연산자 부동소수점 비교 조심
package step04;

public class Exam02_2 {
public static void main(String[] args) {
    
      
      double d1 = 987.6543;
      double d2 = 1.111111;
      System.out.println((d1 + d2) == 988.765411) ; 
      // false
      // 이유?
      // 부동 소수점 값을 연산하는 과정에서 IEEE 754 명세에 따라
      // 작업을 수행한다. 그 과정에 값의 왜곡이 발생할 수 있다.
      // -CPU나 OS.JAVA의 문제가아니다.
      // IEEE 754에서 처리하는
      //컴퓨터에서 발생하는 문제이다.

      System.out.println(d1 + d2); //988.765411000000001

      double x = 234.765411;
      double y = 754.0;
      double EPSLION = 0.000001;
      System.out.println(x + y); // 988.765411
      System.out.println(Math.abs((d1 + d2) - (x + y)) < EPSLION);

      System.out.println((d1 + d2) == (x+ y)); // false 
      
      System.out.println(Math.abs((d1 + d2) - 988.765411) < EPSLION);
    }
}

