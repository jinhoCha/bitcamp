//흐름제어문 - do ~ while 반복문

package step05;

public class Exam03_4 {

    public static void main (String[] args){
     int i = 0;

     // 1부터 10까지 출력하기.
     do 
      System.out.println(++i); //조건을 건후
      
      while ( i < 10); //조건이 맞을때까지 실행한다.
      System.out.println("-----------------------------------");
      
      // 여러개의 문장을 반복할 때는 블록으로 묶어라!
     i = 0;
      do {

       i+=1;
     System.out.println(i); 
     
      } while ( i < 10); //조건이 맞을때까지 실행한다.
  
}
}
