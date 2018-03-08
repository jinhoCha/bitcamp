// 논리 연산자 &&(and) , || (or) , !(not), ^(XOR)
package step04;

public class Exam03_1 {
public static void main(String[] args) {
    
     //AND 연산자 
    // - 두 개의 논리 값이 모두 ture일때 ture가 된다.
    
    System.out.println(true && true) ;  
    System.out.println(true && false) ; 
    System.out.println(false && true) ;  
    System.out.println(false && false) ; 

    System.out.printf("-----밑에는 OR연산자\n");
    //OR 연산자.
    System.out.println(true || true) ;  
    System.out.println(true || false) ; 
    System.out.println(false || true) ;  
    System.out.println(false || false) ; 
    System.out.printf("-----밑에는 NOT연산자\n");
    //NOT 연산자
    // -ture는 fasle로 fasle를 true로 바꾼다.
    System.out.println(!false);
    System.out.println(!true);

    System.out.printf("-----밑에는 XOR연산자\n");
    // XOR 두 개의 값이 다를떄 true이다.
    System.out.println( true ^ true);
    System.out.println( false ^ false);
    System.out.println( true ^ false);
    

    }
}

