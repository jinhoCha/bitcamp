package step22.ex7;

import java.io.IOException;
import java.io.OutputStream;

public class BuffedOutputStream  {
    OutputStream out;
    byte[] buf = new byte[8196];
    int cursor;
    public BuffedOutputStream(OutputStream out) {
        this.out = out;
    }
   
    public void write(int b) throws IOException {
        //버퍼가 다차면 버퍼에 있는 바이트르 한번에 출력할 것이다.
        if(cursor == buf.length) {
            out.write(buf); //버퍼에 들어있는 데이터를 한번에 출력한다.
            cursor=0; //다시 커서를 초기화시킨다.
        }
        
        
    // 1바이트 출력하라고 하면 일단 버퍼에 저장할 것이다.
     buf[cursor++] = (byte)b;
     //버퍼가 다차면 버퍼에 있는 바이트를 한번에 출력할 것이다.
    }
   
    public void close() throws IOException {
        this.flush();
       out.close();
    }
    
    public void flush() throws IOException {
        if(cursor >0 ) {
            out.write(buf, 0, cursor);  //배열주소 ,방번호 ,갯수
            cursor = 0; // flush는  클로즈하지않아도 버퍼에 남으면 일단출력 
//                          강제로 비우는일을 하는역할
        }
    }
}
