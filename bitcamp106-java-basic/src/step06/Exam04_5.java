// 메서드 : 스택 메모리 응용 II 재귀호출 
package step06;
import java.util.Scanner;


public class Exam04_5 {
 
    static int sum(int value){
        if (value == 1)    
        
        return 1;

        return value + sum(value -1); // 예시 sum(x) = x +sum(x-1) ====> sum(5) = 5 + sum(4)
        }

    public static void main(String[] args){
        
        // 다음가 같이 작은수를 할때는 재귀호출이 좋다.
        System.out.println(sum(5)); //      결론 => 5 + 4 + 3 + 2 + 1
                                    // 동작원리  => 5 + sum(4) 
                                    //          =>  5 + 4 + sum(3)
                                    //          => 5 + 4 + 3 +sum(2) 
                                    //          => 5+ 4+ 3+ 2 + sum(1)
                                    // sum(1)은 위에서 if (value == 1) 일때 return 1;이니 1이나온다.

        System.out.println(sum(6)); // 6 + 5 + 4 + 3 + 2 + 1
        // System.out.println(sum(100000)); 이렇게 큰수를 넣으면 스택오버플로우발생
        }
    }

 // 재귀호출

 // 수학식을 코드로 표현하기가 편하다.
 // 코드가 간결하다
 // 그런 반복문을 사용하는 경우보다 메모리를 많이 사용한다.
// 멈춰야할 조건을 빠뜨리면 스택 메모리가 극한으로 증가하여 메모리 부족상태에 빠진다.
// 이런사태를 스택 오버플로우라 부른다
    
   
    