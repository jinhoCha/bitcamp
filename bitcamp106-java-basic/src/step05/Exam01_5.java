//else 문의 소속 흐름제어문

package step05;

import javax.lang.model.util.ElementScanner6;

public class Exam01_5 {
    public static void main (String[] args){
        int age = 15;

        //else는 가장 가까운if에 소속된다.
        // 들여쓰기에 속지말라.
        if (age >= 19)


            if(age >= 70){
                System.out.println("지하철 무임승차 가능합니다.");
            }
            else
            System.out.println("미성년입니다.");
        
    

//만약 else 문을 첫번째 if문에 소속되게 하고 싶다면
// 다음과 같이 두번째 if문을 블록으로 묶어라

if (age >= 19){


            if(age >= 70){
                System.out.println("지하철 무임승차 가능합니다.");
            }
        }
            else // 두번째 if는 첫번째 if문과 블록이 묶여있기때문에 이 esle와는 상관업다.
            System.out.println("미성년입니다.");
        
    }
}