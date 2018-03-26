//과제 ( 2018 - 03 -13)
//사용자로부터 직삼각형의 및변 숫자를 입력 받아 '*' 문자로 그려라

//# 실행결과

package step05.assignment;
import java.util.Scanner;


public class Test01 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("밑변의 길이?");
        int len = sc.nextInt();
       
        int count=1;
        while( count <= len){
            int starCnt = 1;
            while(starCnt <= count){
                System.out.println("*");
                starCnt++;
            }
            System.out.println();
            count++;
        }
    }
}
       