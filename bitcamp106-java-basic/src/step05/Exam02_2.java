//흐름제어문 swich 사용후

package step05;


import java.util.Scanner;


public class Exam02_2 {
    public static void main (String[] args){

        Scanner Sc = new Scanner(System.in);
        System.out.println("[지원 부서]");
        System.out.println("1. 개발");
        System.out.println("2. 관리");
        System.out.println("3. 경비");
        System.out.print("지원 부서 번호를 입력하세요 ? ");
        int no = Sc.nextInt();
      
        System.out.println("[제출 서류는 다음과 같습니다.]");
        switch(no)  {
        case 1 :
            System.out.println("정보 처리 자격증이 필요합니다.");
            System.out.println("졸업 증명서가 필요합니다.");
            System.out.println("이력서가 필요합니다.");
        case 2 : 
            System.out.println("졸업 증명서가 필요합니다.");
            System.out.println("이력서가 필요합니다.");
        case 3 :
            System.out.println("이력서가 필요합니다.");
            break;
        default :
            System.out.println(" 올바른 번호를 입력하세요");
            
        }
        //no 값이 case에 해당되는 경우
        // break 명령을 만날 때까지 아래로 계속 실행된다.
    }
}