package step05;
import java.util.Scanner;


public class Test03_2 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("밑변의 길이? ");
        int len = keyScan.nextInt();

         for(int i=len; i>=0; i--){
            
                for(int j=0; j<=i; j++){
                 System.out.print("*");
                  
                }
                System.out.printf("\n");
         }
         
        }
    }