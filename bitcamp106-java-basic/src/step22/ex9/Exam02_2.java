//java I/O API - ObjectOutputStream과 java.io.Serializable 인터페이스
package step22.ex9;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam02_2 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut =new FileOutputStream("temp/test9_3.data");
        BufferedOutputStream bufOut = new BufferedOutputStream(fileOut);
        ObjectOutputStream out = new ObjectOutputStream(bufOut);
       
        
        
        Member2 member = new Member2();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        // ObjectOutputStream 인스턴스의 값을 바이트 배열로 만들어 출력하는 기능이 있따.
                
     
        out.writeObject(member);
        // Member2 클래스는 java.io.serializable을 구현했기 떄문에
        // 바이트 배열로 자동 변환하는 것이 가능하다.
        //그래서 writeObject
        //writeObject()는 인스턴스의 값만 출력하는 것이 아니라,
        // 인스턴스의 클래스 이름과 인스턴 변수의 타입 정보도 함께 출력한다.
        //출력데이터 = 클래스이름 + 인스턴스 변수정보+ 인스턴스 변수 값
        
        out.close();
        
        System.out.println("데이터 출력 완료!");

    }

}
// 용어 정리!
//Serialize : 객체 ==========> 바이트배열 (marshalling) 이라고도 불린다.
//DeSeriailze : 바이트 배열 ==========>객체 (unmarshalling)이라 부른다
