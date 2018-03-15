//흐름제어문 - do ~ while 반복문

package step05;

public class Exam04_1 {

    public static void main (String[] args){
    //for ( 변수 선언 및 초기화 ; 조건; 증감문)
      // for 문안에 선언된 변수는 for문을 나가는순간 제거된다.
    for (int i = 1; i<= 5; i++)
      System.out.println(i);
      System.out.println("-----------------------------------");

      for (int i = 1; i<= 5; ){
        System.out.println(i);
        i++;
  } // 다 똑같음
  System.out.println("-----------------------------------");
     int i =1;
        for (;;) {
         if (i > 5)
          break;
        System.out.println(i);
         i++;
    }
    }
  }

