//흐름제어문 - for 반복문의 초기화 변수

package step05;

public class Exam04_2 {

    public static void main (String[] args){
    //for ( 변수 선언 및 초기화 ; 조건; 증감문)

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

