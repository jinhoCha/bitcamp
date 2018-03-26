package step09.assginment;

import java.util.Calendar;
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        
        System.out.print("년 , 월, 일 ? (ex : 2018 3 21 )");
        int year = sc.nextInt();
        int month= sc.nextInt();
        int day = sc.nextInt();
        
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month - 1);
        c.set(Calendar.DATE, day);
        
        String[] weeks = {"","일", "월", "화", "수", "목", "금", "토"};
        
        // int i = c.get(Calendar.DAY_OF_WEEK);
        System.out.printf("요일: %s요일\n",weeks[c.get(Calendar.DAY_OF_WEEK)]);
        System.out.printf("주차: %d주차\n",c.get(Calendar.WEEK_OF_MONTH));
        System.out.printf("일차: %d일차\n",c.get(Calendar.DAY_OF_YEAR));
        
        
        
       
     
                
                
       // System.out.println(c.get(Calendar.DATE)); // 요일이 찍힘
       // System.out.println(c.get(Calendar.WEEK_OF_MONTH)); // 그달에 몇번째주
        
        
    }
}
