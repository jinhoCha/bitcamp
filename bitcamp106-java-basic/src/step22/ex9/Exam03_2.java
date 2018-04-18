//java I/O API - ObjectOutputStream과 java.io.Serializable 인터페이스
package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam03_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn =new FileInputStream("temp/test9_4.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
       
        //실행하기 전 해야할 일:
        // 1) test9_3.data 파일을 일기 전에
        
        Member3 member = (Member3)in.readObject();
       // Exam02_4.java와 달리
        // Member3로 객체의 시리얼 데이터를 출력한다음,
        // Member3를 변경하더라도 데이터를 읽는데 실행 오류가 발생하지 않았다.
        // 이유?
        // 클래스버전번호가 같기 때문이다.
        // 클래스가 변경되더라도 클래스의 serialVersionUID의 값이 같다면
        // 같은 클래스로 간주한다.
        // 그래서 readObject()를 호출하여 시리얼 데이터를 읽을떄 오류가 발생하지 않는다.
        
        //serialVersionUID의 사용법
        // 클래스를 변경하더라도 기존 데이터를 읽는데 문제가 없다면
        // 변경한 클래스의 버전을 이전 버전과 같게하라ㅏ!
        // => 그러나 클래스의 변경 사항이 너무많아 이전 데이터를 읽기가 부적합하다면
        // 변경한 클래스의 버전을 바꿔 읽을 때 오류가 나게하
        
        in.close();
        
        System.out.println(member);
        

    }

}
// 용어 정리!
//Serialize : 객체 ==========> 바이트배열 (marshalling) 이라고도 불린다.
//DeSeriailze : 바이트 배열 ==========>객체 (unmarshalling)이라 부른다
