// DataOutputStream을 이용하여 객체 출력 - 인스턴스의 값을 출력
package step22.ex8;

import java.io.FileOutputStream;

public class Exam01_1 {

    public static void main(String[] args) throws Exception {
        FileOutputStream fileOut =new FileOutputStream("temp/test8.data");
        
        // 기존의 FileOutputStream 객체에 String,int,boolean 값을 출력 수 있는
        // 장신구/보조장치/플러그인(decorator)를 장착한다.
        DataOutputStream out = new DataOutputStream(fileOut);
        
        Member member = new Member();
        member.name = "AB가각간";
        member.age = 27;
        member.gender = true;
        
        // 인스턴스의 값을 출력하라!
        // 1) 이름 출력 
        long startTime = System.currentTimeMillis();
                
        for (int i = 0; i< 100000; i++) {
        out.writeUTF(member.name); 
        
        // 2) 나이 출력 (4바이트)
        out.writeInt(member.age);
        
        // 3) 성별 출력 (1바이트)
        out.writeBoolean(member.gender);
        } 
        long endTime = System.currentTimeMillis();
        out.close();
        
        System.out.println("데이터 출력 완료!");
        System.out.println(endTime - startTime);

    }

}
