// 논리 연산자 & , | 한개일때.
package step04;

public class Exam03_2 {
public static void main(String[] args) {
    
     //AND 연산자 
    // - 두 개의 논리 값이 모두 ture일때 ture가 된다.
    
    System.out.println(true & true) ;  
    System.out.println(true & false) ; 
    System.out.println(false & true) ;  
    System.out.println(false & false) ; 

    System.out.printf("-----밑에는 OR연산자\n");
    //OR 연산자.
    System.out.println(true | true) ;  
    System.out.println(true | false) ; 
    System.out.println(false | true) ;  
    System.out.println(false | false) ; 

   
    }
}

