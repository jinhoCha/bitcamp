//java I/O API - Serializable와 transient
package step22.ex9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exam04_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn =new FileInputStream("temp/test9_5.data");
        BufferedInputStream bufIn = new BufferedInputStream(fileIn);
        ObjectInputStream in = new ObjectInputStream(bufIn);
       
        //실행하기 전 해야할 일:
        // 1) test9_3.data 파일을 일기 전에
        
        Score s = (Score)in.readObject();
       // 주의!
        // => deserialize를 통해 인스턴스가 생성될 때는 생성자가 호출되지 않는다.
        
        in.close();
        
        // = > transient 변수의 값은 출력되지 않았기 때문에 읽을 수가 업다.
        System.out.println(s); // sum과 aver이 0으로 출력된다.
        
        //=> transient 값은 인스턴스를 준비한 후 별도의 메서드를 통해 다시 계산해야된다.
        s.compute();
        System.out.println(s); // sum=271 aver 90.333336이 출력된다.
        
        // 조금이라도 데이터 왜곡을 방지하기 위함이다.
        // 그러니 번거롭다 생각말고 다른 인스턴스 변수의 값으로 계산한 결과는
        // 가능한 출력하지 말고, 읽을 때 다시 계산하도록 하라!
    }

}
// 용어 정리!
//Serialize : 객체 ==========> 바이트배열 (marshalling) 이라고도 불린다.
//DeSeriailze : 바이트 배열 ==========>객체 (unmarshalling)이라 부른다
