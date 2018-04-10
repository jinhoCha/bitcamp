package step21.ex1;

public class Exam01_2 {

    public static void main(String[] args) {
        // 유효한 값을 지정하여 메서드를 호추할 떄,

        int result = Calculator.compute("#",100, 200);


        // 제대로 계산을 수행했는지 검사하기 위해서 보통 리턴 값을 검사한다.
        if(result == -1) {

            System.out.println("유효하지 않은 연산자입니다.");
        }
        else {
            System.out.println(result);
        }

        // 리턴 값을 검사하는 방식의 문제는 다음과 같이 정상적인 계산 결과도
        // 잘못된 계산으로 취급한다는 점이다.
        result = Calculator.compute("-", 6, 7); // 6 - 7 

        //위의 계산 결과는 정상적인 값이다.
        // 그런대도 불구하고 다음과 같이 -1을 리턴하는 경우 오류로 간주하기 떄문에
        // 잘못된 실행결과를 출력한다.
        if(result == -1) {

            System.out.println("유효하지 않은 연산자입니다.");
        }
        else {
            System.out.println(result);
        }
    }

}
