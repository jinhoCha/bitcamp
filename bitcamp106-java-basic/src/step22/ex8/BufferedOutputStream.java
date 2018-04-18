// OutputStream에 붙이는 플러그인(데코레이터)을 다른 플러그인에 다른 플러그인에 붙이려면,
// 플러그인(데코레이터) 클래스도 OutputStream의 가족이 되어야 한다.
package step22.ex8;

import java.io.IOException;

import java.io.OutputStream;
//OutputStream을 상속받아 OutputStream의 가족으로 거듭난다.
//그러나 OutputStream을 상속받았다고 해서 특별이 그 상속받은 기능을 이용하는 것은 아니다.
//단지 같은 OutputStream 그룹에 소속되기 위함이다.
//이상속은 기능 상속의 의미로 상속 받기 위한것이 아니다.
//같은 그룹으로 묶이기 위함이다.
public class BufferedOutputStream extends OutputStream{
    OutputStream out;
    byte[] buf = new byte[8196];
    int cursor;
    public BufferedOutputStream(OutputStream out) {
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
