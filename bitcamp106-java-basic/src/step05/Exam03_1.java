//흐름제어문 - 반복문 while

package step05;


import java.util.Scanner;
  

public class Exam03_1 {

    public static void main (String[] args){
      int count = 0;

      //while(조건){}
      // => 조건
      while (count <5){
        System.out.println(count++);

        
      }
      System.out.println("----------------------------------------");
        //while (조건) {}
        // => 여러 개의 문장을 반복 실행하려면 블록으로 묶어라!
        count = 0;
        while ( count <5 ){
            System.out.println(count);
            count++;
        }
    }

}



