// 이클래스는 명령창에서 사용할 기능을 모아둔 클래스이다.
package bitcamp.java106.pms.util;

import java.util.Scanner;
public class Console {
    //이 클래스를 사용하기전에 반드시 Scanner 객체를 설정하라!!!!
   public static Scanner keyScan;

    public static boolean confirm(String massage){
        System.out.printf("%s (y/n) ", massage);
        String input = keyScan.nextLine().toLowerCase();
        if (input.equals("y"))
            return true;
            else
            return false;
    }

            public static String[] prompt() {
                System.out.print("명령> ");
                return keyScan.nextLine().toLowerCase().split(" ");
            
          
    }
}