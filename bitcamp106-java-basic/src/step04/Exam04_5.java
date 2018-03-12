// 비트 이동 연산자 : 응용 2
package step04;

public class Exam04_5 {
public static void main(String[] args) {
    
  // Yes / NO 또는 true/ false 값을 저장할때
  // 비트 연산자를 사용하면 메모미를 절약할 수 있다.

  //비트 연산자 사용전 
  // => 각각의 상태를 별도의 변수에 저장해야 한다.
  // 8개의 데이터를 저장하기 위해 필요한 메모리는 32바이트가 소요된다.
  boolean c, cpp, java, js, python, php, html, css;

  c = true;
  cpp = false;
  java = true;
  js = false;
  python = true;
  php = false;
  html =true;
  css =false;

    //=> 물론 배열을 이용할 수 있다.
    // boolean 배열을 JVM에서 다룰 때는 각 boolean에 대해
    // 1바이트를 사용한다. 
    // 따라서 8개의 데이터를 저장하기위해 8바이트가 사용된다.
    boolean[] lang = new boolean[8];
    lang[0] =true;
    lang[1] =false;
    lang[2] =true;
    lang[3] =false;
    lang[4] =true;
    lang[5] =false;
    lang[6] =true;
    lang[7] =false;

    //비트 연산자 사용후
    // -> 4바이트 변수 한 개만 있으면 최대 32개의 데이터를 저장 할 수 있다.
    int lang2=0;
    lang2 = 0x80;  // c= true 
    //0000_0000 | 1000_0000 = 1000_0000 
//    lang2 |= 0x00; // c++ = false 

    lang2 |= 0x20; // java= true
    //1000_0000 | 0010_0000 = 1010_0000 

 //   lane2 |= 0x00; // js = false
    lang2 |= 0x08; // python = ture
    //1010_0000 | 0000_1000 = 1010_1000 
 //   lane2 |= 0x40; // php = false
    lang2 |= 0x02; // html = true
    //1010_0000 | 0000_0010 = 1010_1010 
 //   lane2 |= 0x40; // css = false
    
    //즉 비트를 이용하여 각 데이터의 true/ false를 표현한다.

  }
}

