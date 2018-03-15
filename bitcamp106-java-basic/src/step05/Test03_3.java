package step05;
import java.util.Scanner;


public class Test03_3 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("높이? ");
        int len = keyScan.nextInt();

         for(int i=0; i<len; i++){
                for(int j=0; j<=len-i; j++)
                 System.out.print(" ");
                  for(int j=0; j < i * 2 + 1; j++)
                  System.out.printf("*");
                
                System.out.printf("\n");
         
        }
        }
    }