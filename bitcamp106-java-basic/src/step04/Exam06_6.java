// 증감 연산자 : 전위 연산자 감소
package step04;

public class Exam06_6 {
public static void main(String[] args) {
     
    int i = 5;

     --i;
     --i;
    System.out.println(i); //3
    System.out.println(i--); //3
    // == >> 2로 바뀜
    System.out.println(--i); //1
  
  }
}


