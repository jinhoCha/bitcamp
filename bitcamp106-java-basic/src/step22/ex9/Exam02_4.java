//java I/O API - ObjectOutputStream과 java.io.Serializable 인터페이스
package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam02_4 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn =new FileInputStream("temp/test9_3.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
       
        //실행하기 전 해야할 일:
        // 1) test9_3.data 파일을 일기 전에
        
        Member2 member = (Member2)in.readObject();
       
        in.close();
        
        System.out.println(member);
        

    }

}
// 용어 정리!
//Serialize : 객체 ==========> 바이트배열 (marshalling) 이라고도 불린다.
//DeSeriailze : 바이트 배열 ==========>객체 (unmarshalling)이라 부른다
