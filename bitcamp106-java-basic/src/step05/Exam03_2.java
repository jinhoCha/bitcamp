//흐름제어문 - 반복문 while

package step05;


import java.util.Scanner;
  

public class Exam03_2 {

    public static void main (String[] args){
      int count = 0;
      int sum = 0;

      //1부터 100까지의 합은?
      while (count < 100){
         count++;
          sum += count;
          
      }
      System.out.printf("sum= %d, count =%d\n",sum, count );

      System.out.println("-------------------------------------");
      //continue
      // 1부터 100까지의 짝수의 합은?
        count =0;
        sum = 0;
      while(count < 100){
          count++;
          if (count % 2 == 0){
            sum += count;
          } 
          
          
      }
      System.out.printf("count = %d, sum = %d\n", count, sum);
      
    

    System.out.println("-------------------------------------");
      //continue
      // 1부터 100까지의 짝수의 합은?
        count =0;
        sum = 0;
      while(count < 100){
          count++;
          if (count % 2 == 1)
              continue; //  다음 문장을 실행하지 말고 즉시 조건 검사로 이동한다.
            sum += count;
          
          
          
      }
      System.out.printf("count = %d, sum = %d\n", count, sum);
      
    

    // break 사용전
    System.out.println("-------------------------------------");
    //continue
    // 1부터 100까지의 짝수의 합은?
      count =0;
      sum = 0;
    while(count < 100){
        count++;
        if (count > 50)
            continue; //  다음 문장을 실행하지 말고 즉시 조건 검사로 이동한다.
          sum += count;
        
        
        
    }
    System.out.printf("count = %d, sum = %d\n", count, sum);

    // break 사용전
    System.out.println("-------------------------------------");
    //continue
    // 1부터 100까지의 짝수의 합은?
      count =0;
      sum = 0;
    while(count < 100){
        count++;
        if (count > 50){
            break;} //  반복문을 나간다.
          sum += count;
        
        
        
    }
    System.out.printf("count = %d, sum = %d\n", count, sum);

    }
}

