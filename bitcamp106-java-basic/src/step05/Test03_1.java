package step05;
import java.util.Scanner;

// 정삼각형 그리기
import java.util.Scanner;

public class Test03_1 {
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("가로 길이? ");
        int len = keyScan.nextInt();
      

        int starLen = 1;
        while (starLen <= len) {
            int spaceCnt = 1;
            int spaceLen = (len - starLen) / 2;
            while(spaceCnt <= spaceLen){
                System.out.print(" ");
                spaceCnt++;
            } //스페이스를 출력

            int starCnt = 1;
            while (starCnt <= starLen){
                System.out.print("*");
                starCnt++;
            }

            System.out.println();
            starLen +=2;
        }
    }
}
   