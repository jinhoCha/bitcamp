// 비트 이동 연산자 : 응용 3
package step04;



public class Exam04_6 {
public static void main(String[] args) {
    
  // 다음 변수의 값을 조사하여 개발자가 어떤 프로그래밍 언어를 사용할 수 있는지
  // 출력하라.
  // 각 비트의 해당하는 프로그래밍 언어는 다음 순서를 따른다.
  // c, cpp, java, js, python, php, html, css;


  int and = 0b1000_0000;
  int lang = 0b1110_0011;
  int c = 0b1000_0000;
  int cpp = 0b0100_0000;
  int java =0b0010_0000;
  int js = 0b0001_0000;
  int python = 0b0000_1000;
  int php = 0b0100_0100;
  int html =0b0000_0010;
  int css = 0b0000_0001;
  
 if ((lang & 0b1000_0000) == 0x80)   // if((lang & 0x80) == 0x80)
    System.out.println(" c ");
    if ((lang & 0b0100_0000) == cpp)
    System.out.println(" cpp ");
    if ((lang & 0x20) == java)
    System.out.println(" java ");
    if ((lang & 0x10) == js)
    System.out.println(" js ");
    if ((lang & 8) == python)
    System.out.println(" python ");
    if ((lang & 4) == php) 
    System.out.println(" php ");
    if ((lang & 2) == html)
    System.out.println(" html ");
    if ((lang & 1) == css)
    System.out.println(" css ");

   

  }
}

