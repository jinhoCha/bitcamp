// 메서드 사용후
package step06;
import java.util.Scanner;



public class Exam01_2 {

    //스페이스를 출력하는 코드들을
    //관리하기 쉽도록 별도의 블록에 모아 놓는다.
    // 그리고 그 블록에 대해 이름을 붙인다.
    // => 이렇게 정의한 블록을 "메서드(method)" 또는 함수라고 부른다.
    // 자바는 메서드 이름을 주로 사용한다.
    public static void printSpaces(int len) {
        for (int i =1; i<= len; i++){
            System.out.print(" ");
        }
    }
    // '*' 문자를 출력하는 ㄴ코드를 관리하기 쉽게 별도의 블록을 빼둔다.
    // 그리고 그블록의 이름을 붙인다
    // 이렇게 별도로 빼둔 코드 블록에 이름을 붙인것을 매서드라 부른다.
    public static void printstars(int len){
        for (int i = 0; i < len; i++){
            System.out.print("*");
        }
    }
    public static void main(String[] args){
        Scanner keyScan = new Scanner(System.in);
        System.out.print("가로 길이? ");
        int len = keyScan.nextInt();
      
        
            for (int starLen = 1; starLen <= len; starLen +=2){
                //명령 기능들을 기능 별로 묶어 놓고
                // 필요할때마다 다음과 같이 사용하면
                //코드를 읽기가 쉬워진다.

                printSpaces((len - starLen) / 2);
                printstars(starLen);
                System.out.println();
            }
        }
    }


   