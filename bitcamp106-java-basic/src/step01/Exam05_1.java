// 정수의 리터럴(literal)
package step01;

public class Exam05_1 {
    public static void main(String[] args) {
        // 10진수
        System.out.println(100);

        //8진수
        // - 0으로 시작한다 ex(0133), (0144)
        System.out.println(0144);

        //2진수 
        // -0b 또는 0B 로 시작한다.
        System.out.println(0b1100100);
        System.out.println(0B1100100);

        //16진수 
        // ox 또는 OX로 시작한다.
        System.out.println(0x64);
    }
}

// 10진수
//  - 일반적으로 값을 알려주고 싶을때 사용한다.
// 8진수
// -코드에서 거의 사용하지 않는다.
// 2진수
// -메모리 상태를 알려주고싶을때 사용한다.
// 16진수
// - 2진수로 표기하면 길어지기때문에 사용한다.
// 결론 
// 코드를 작성할때 주로 10진수로 표기한다.
// 간혹 메모리 상태에 집중하라고 강조하고싶을떄 16진수로 표기한다.