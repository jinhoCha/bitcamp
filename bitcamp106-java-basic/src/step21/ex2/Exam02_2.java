// 예외 처리 문법을 적용하기 전 - 예외 발생 시 시스템 멈춤 문제

package step21.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam02_2 {

    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        while (true) {
            System.out.println("입력 >");
            String op = keyScan.next();
            if (op.equalsIgnoreCase("quit"))
                break;
            try {
            int v1 = keyScan.nextInt();
            int v2 = keyScan.nextInt();
            
            // 다음과 일반적인 예외의 경우 리턴 값을 검사하여 처리하면 된다.
            // 문제는 0으로 나누는 경우에서 처럼 계산할 수 없는 예외 상황이 발생한 경우,
            // JVM은 실행을 종료하게 된다.
            // = > 0으로 나눌 때처럼 예외가 발생하더라도 JVM을 멈추지 않고
            // 계속 정상적으로 실해오디게 만드는 문법이 " 예외처리 " 이다.
                int result = Calculator3.compute(op,v1,v2);
                System.out.println(result);
            } catch (InputMismatchException e) {
                System.out.println("입력 값이 유효하지 않습니다.");
                keyScan.nextLine(); // 입력이 잘못되었을 경우 나머지입력을 무시한다.
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
            

            }
           
        
        keyScan.close();


    }

}
