// 증감 연산자 : 후위 증감 연산자 응용11
package step04;

public class Exam06_4 {
public static void main(String[] args) {
     
    int i = 2 ;
    int result = i++ + i++ * i++;
    System.out.printf("%d, %d\n",i,result);
    // int result = 2 + 3 % 4;
    // int i = 5;
    //  5          
    // 3 + 3 * 4 ;
     
    int j = 2 ;
    int re = ++j + j++ * j++;
    System.out.printf("%d, %d",j, re);
  
  }
}


