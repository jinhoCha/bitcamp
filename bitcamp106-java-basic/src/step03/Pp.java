package step03;

//미리 컴파일러에게 클래스의 위치 정보를 알려준다
//컴파일한 후 import 명령은 제거된다
//즉 .class 파일에 포함되지 않는다
//그러니 import 문장이 많으면 .class 파일이 커지지 않을까 걱정말라
import java.util.*;
import java.util.Scanner;
public class Pp {
    public static void main(String[] args) {

      Scanner Sc = new Scanner(System.in);

      
      int i = 1, j = 1, n; 
  
      int fib; 
  
      System.out.printf("숫자를 입력해주세요 "); 
      int number = Sc.nextInt();

      System.out.printf("%d 피보나치 수열\n", number); 
      for (fib = 1; fib <= number; fib++) 
      { 
         // k가 1이거나 2라면 1을 대입한다 
         // 피보나치는 1 1 에서 시작  
         if (fib == 1 || fib == 2) // fib가 1 또는 2면 피보나치는 1에서 시작한다 
         { 
            n = 1; 
         }  
        else 
         { 
           // i와 j를 더한다 
            n = i + j; 
            // n번째 자리에 n+1 자리에 있던 수를 대입한다. 
            i = j; 
            // n+1번째 자리에 n+2 자리에 위치하는수인 n을 대입한다. 
            j = n; 
         } 
         // 결과 출력 
         System.out.printf ("%d\n", n); 
      } 
      
  }
}
  


 
