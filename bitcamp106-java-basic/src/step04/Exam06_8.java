// 증감 연산자 : 전위 연산자 증감 응용1
package step04;

public class Exam06_8 {
public static void main(String[] args) {
     
    int i = 2;

      int result = ++i + ++i * ++i;
      // 3 + 4 * 5;
      // = 23;
      // i = 5;
      System.out.println(result); //23

     // int x = ++100; 리터럴에 적용할수 없다.
     // x = 100++;

     // 2) 변수에 동시에 적용할수 없다.
     //int y = 100;
     //++y++;
     //(++y)++;

     int A =5;
     int B =7;
     int C =0;
     int D =3;

     A = D; // 3
     B = C; // 0
     C = B; // 0
     D = A; // 3
    System.out.printf("%d,%d,%d,%d",A,B,C,D);

    // 
     //A <= D; 3
     //B <= C; 0
     //C <= B; 7
     //D <= A; 5

  }
}


