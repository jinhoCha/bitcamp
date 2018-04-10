package step21.ex1;

public class Exam01_3 {

    public static void main(String[] args) {
        // 유효한 값을 지정하여 메서드를 호추할 떄,

        int result = Calculator2.compute("#",100, 200);


        // 제대로 계산을 수행했는지 검사하기 위해서 보통 리턴 값을 검사한다.
        if(result == -1212121212) {

            System.out.println("유효하지 않은 연산자입니다.");
        }
        else {
            System.out.println(result);
        }

        // 리턴 값을 검사하는 방식의 문제는 다음과 같이 정상적인 계산 결과도
        // 잘못된 계산으로 취급한다는 점이다.
        result = Calculator2.compute("-", 6, 7); // 6 - 7 

        //위의 계산 결과는 정상적인 값이다.
        // 그런대도 불구하고 다음과 같이 -1을 리턴하는 경우 오류로 간주하기 떄문에
        // 잘못된 실행결과를 출력한다.
        if(result == -1212121212) {

            System.out.println("유효하지 않은 연산자입니다.");
        }
        else {
            System.out.println(result);
        }
            // 아무리 희귀한 값을 리턴한다 하더라도 결국에는 그 희귀한 값이 또한
            // 정상 값일 수 있따. 이것은 해결할 수 없다.
            
            //다음예는 계산결과가 -1212121212이다.
            //=> 그런데도 연산자가 유효하지 않다고 처리한다.
            // 결국 리턴 값을 검사하여 오류 여부를 처리하는 것으로는
            // 이런 문제를 해결 할 순 없다.
            result = Calculator2.compute("+", -2078654356, 866533144);
            
            if(result == -1212121212) {

                System.out.println("유효하지 않은 연산자입니다.");
            }
            else {
                System.out.println(result);
                
            
        }
        // 리턴 값으로 작업 오류를 알려줄 때 그 한계로 극복하기 위해 만든 문법이
            // " 예외처리 " 문법이다.
            // => 예외 상황이 발생했을 때 호출자에게 다른방식으로 예외를 알려주는 문법이다.
    }

}
