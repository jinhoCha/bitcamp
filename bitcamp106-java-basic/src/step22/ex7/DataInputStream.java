
// DataInputStream을 FileInputStream이나 ByteArrayInputStream에 붙일 수 있또록
package step22.ex7;

import java.io.FileInputStream;
import java.io.InputStream;

public class DataInputStream {/* 중요
    DataInputStream이 InputStream을 사용한다. 사용하려면  InputStream in;을 만들어줘야한다.
       */ InputStream in;
    
    
    public DataInputStream(InputStream in) throws Exception {
        this.in = in;
    }
    
    public String readUTF() throws Exception {
        int size = in.read();   // 생성자에서받은 InputStream에서 도움을 받아야한다.
        // 생성자에서 받은 입력 객체의 메서드를 사용하여 문자열 출력
        byte[] bytes = new byte[size];
        in.read(bytes); // 이름 배열 개수 만큼 바이트를 읽어 배열에 저장한다.
        return new String(bytes, "UTF-8");
    }
    
    public int readInt() throws Exception {
        // 생성자에서 받은 입력 객체의 메서드를 사용하여 int 값 출력
        int value = 0;
        
        value = in.read() << 24;
        value += in.read() << 16;
        value += in.read() << 8;
        value += in.read();
        return value;
    }
    
    public long readLong() throws Exception {
        // 생성자에서 받은 입력 객체의 메서드를 사용하여 long 값 출력
        long value = 0;
        value += (long)in.read() << 56;
        value += (long)in.read() << 48;
        value += (long)in.read() << 40;
        value += (long)in.read() << 32;
        value += (long)in.read() << 24;
        value += (long)in.read() << 16;
        value += (long)in.read() << 8;
        value += (long)in.read();
        return value;
    }
    
    public boolean readBoolean() throws Exception {
        // 상속 받은 read() 메서드를 사용하여 boolean 값 출력
        if (in.read()==1) 
            return true;
        else 
            return false;
    }
    public void close() throws Exception {
        in.close();
    }
}





