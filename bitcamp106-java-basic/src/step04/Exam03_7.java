// 논리 연산자  : 조건문과 비트 연산
package step04;

public class Exam03_7 {
public static void main(String[] args) {
    
    int i = 1;
    System.out.println(i << 1);
    System.out.println(i << 2);
    System.out.println(i << 3);
    System.out.println(i << 4);
    // 왼쪽으로 이동 후,
    // 오른쪽 빈 자리 : 0으로 채운다.
    // 왼쪽의 넘친 비트 : 짜른다.
    i = 0000_1011; // 11   
    // i =4`B1011; 자바에서는 안됨..
    System.out.println( i << 1 ); //22 => 0001 0110
    System.out.println( i << 2 ); //44 => 0010 1100
    System.out.println( i << 3 ); //88 => 0101 1000
}
}

//왼쪽 이동
// - 비트 이동은 곱하기 2 한것과 같은 효과를 준다.