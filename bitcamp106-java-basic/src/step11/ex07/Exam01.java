// 기본 생성자 호출확인.
package step11.ex07;

public class Exam01 {
    public static void main(String[] args) {

        // B클래스의 설계도에 따라 hEAP 영역에 변수를 준비한다.
        // = > B클래스는 A클래스도 사용한다고 선언했기 떄문에
        //     A클래스의 설계도에 따라 A 클래스에 선언된 인스턴스 변수도 함께 생성된다.
        B obj = new B();
        
        System.out.printf("v1=%d, v2=%d\n", obj.v1, obj.v2);

    }
}

