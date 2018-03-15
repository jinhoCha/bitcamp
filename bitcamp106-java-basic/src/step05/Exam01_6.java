//흐름제어문 if ~ else if ~else if ~ else

package step05;

import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;
public class Exam01_6 {
    public static void main (String[] args){

        Scanner Sc = new Scanner(System.in);
        System.out.print("나이를 입력하세요 ? ");
        int age = Sc.nextInt();
      

        
        if (age <8){
            System.out.println("아동입니다");
        }
        else {
            if (age >=8 && age < 14)
            System.out.println("어린이 입니다");
            else{
                if (age >14 && age <19)
                System.out.println("청소년 입니다");

                else{
                    if (age >= 19 && age <65)
                    System.out.println("성인입니다");

                    else
                        System.out.println("노인입니다");
                }
            }
        }


            // if ~ else ~ 만 있다면 블록을 묶지 않아도 된다.
        if (age <8)
            System.out.println("아동입니다");
        
        else 
            if (age >=8 && age < 14)
            System.out.println("어린이 입니다");
            else
                if (age >14 && age <19)
                System.out.println("청소년 입니다");

                else
                    if (age >= 19 && age <65)
                    System.out.println("성인입니다");

                    else
                        System.out.println("노인입니다");
                
            // if ~ else를 보기 좋게 정렬하자! 
       if (age <8)
                  System.out.println("아동입니다");
           else if (age >=8 && age < 14)
           System.out.println("어린이 입니다");
           else if (age >14 && age <19)
                   System.out.println("청소년 입니다");
           else if (age >= 19 && age <65)
                   System.out.println("성인입니다");
           else
                   System.out.println("노인입니다");
                            






    }
}