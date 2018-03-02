// 정수의 리터럴(literal) 메모리에 저장하는 방법
package step01;
public class Exam06_1 {
    public static void main(String[] args) {
        System.out.println(3.14);

        //exponential 표기를 사용하기
        //숫자 e지수 또는 숫자 E지수
        System.out.println(0.0314e2); // 0.0314 * 10의 2승
        System.out.println(0.314e1); // 0.0314 * 10의 1승
        System.out.println(31.4e-1); // 0.0314 * 10의 -1승
        System.out.println(314e-2); // 0.0314 * 10의 -2승
        // => 이렇게 e 기호를 사용하면 소수점의 위치를 조정할수있다.
        // => 소수점의 위치가 움직인다고해서 부동 소수점이라고 부른다.

    }
}