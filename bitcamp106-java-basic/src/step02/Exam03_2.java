// 변수 - 다양한 변수 선언 방법

package step02;
 
public class Exam03_2 {
    public static void main (String[] args){
        int v1,v2,v3;
        boolean b1,b2,b3; // 논리값을 ture , false 두개만 있다. ture는 1 flase 0이다.

    }
}
// 변수 선언
// - 값을 저장할 메모리를 준비시키는 명령
// 문법
// -메모리종류 별명;
// 메모리 종류
// 1) primitive data type
// 자바에서 기본으로 제공하는 메모리 종류 (원시 데이터 타입)
// -정수 , - 부동소수점 , -문자, -논리값, -문자열
// -정수 -byte : 1byte (-128 ~ 127)
//      -short : 2byte (-32768 ~ 32767)
//      -int   : 4byte (약 -21억 ~ 21억)
//      -long  : 8byte (약 -922경 ~ 922경)
// -부동소수점
//      -float : 4byte (유효자릿수 7)
//      -double: 8byte (유효자릿수 15)
// -문자
//      -char : 2byte (0 ~ 65535). UTF-16 코드 값 저장.
// -논리값
//  -boolean : JVM에서 4byte 메모리를 사용한다.

// 레퍼런스(reference)
// 데이터가 저장된 메모리의 주소를 저장하는 메모리
// -문자열(주소)
//      -String : 문자열이 저장된 주소를 저장한다.
