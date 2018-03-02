// 정수의 리터럴(literal) 크기
package step01;

public class Exam05_3 {
    public static void main(String[] args) {
        // 정수를 표기할떄 ..
        // 크기에 따라 표기방법은 다르다.
        // 그냥 작성하면 4바이트 크기의 정수를 의미한다.
        System.out.println(2147483647); //4바이트 양의 정수 최대값
        System.out.println(-2147483647); //4바이트 음의 정수 최소값.
        // 4바이트를 초과하면 오류
        // 숫자가1증가하면 4바이트 메모리가 넘치기 때문이다.
        //System.out.println(2147483648); //4바이트 양의 정수 최대값
        //System.out.println(-2147483649); //4바이트 음의 정수 최소값.

        //해결방법
        //=> 4바이트 메모리보다 더 큰 메모리로 숫자를 저장하라고 명령을 내려라.
        System.out.println(2147483648L); //4바이트 양의 정수 최대값
        System.out.println(-2147483649L); //4바이트 음의 정수 최소값.
        //대문자 L을 쓰는경우는 소문자 l을 쓸경우 숫자1과 헷갈린다

        //=> 8바이트 정수의 최대값 및 최소값
        // => 자바에서는 각 데이터 유형에 따라 최대/최소 값을 알아볼 수 있도록
        // 특별한 명령을 제공한다.
        System.out.println(Integer.MAX_VALUE); //4바이트로 표현 할수 있는 최대
        System.out.println(Integer.MIN_VALUE); // 4바이트 정수 최소
        System.out.println(Long.MAX_VALUE); // 8바이트 정수 최대값
        System.out.println(Long.MIN_VALUE); // 8바이트 정수 최소값

        //따라서 다음은 크기가 다른 정수이다.
        System.out.println(100); // 4바이트 크기의 정수 값
        System.out.println(100L); // 8바이트 크기의 정수 값
    }
}

