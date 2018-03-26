package step03.assginment;
import step03.assginment.Bitcamp;
//미리 컴파일러에게 클래스의 위치 정보를 알려준다
//컴파일한 후 import 명령은 제거된다
//즉 .class 파일에 포함되지 않는다
//그러니 import 문장이 많으면 .class 파일이 커지지 않을까 걱정말라
import java.util.*;

public class Home01 {
    public static void main(String[] args) {

        java.util.Scanner keyscan = new java.util.Scanner(System.in);

        step03.assginment.Bitcamp[] arr= new step03.assginment.Bitcamp[5];//이것의 역할
        String conti;
        
        for(int i=0;i<arr.length;i++){
            arr[i] = new step03.assginment.Bitcamp();//배열선언
            
            System.out.print("팀명?");
            arr[i].tname = keyscan.nextLine();
            System.out.print("설명?");
            arr[i].exp = keyscan.nextLine();
            System.out.print("최대인원?");
            arr[i].maxp = keyscan.nextLine();
            System.out.print("시작일?");
            arr[i].startd = keyscan.nextLine();
            System.out.print("종료일");
            arr[i].endd = keyscan.nextLine();

            System.out.println("계속 하실거면 Y,그만하실거면 N");
            conti=keyscan.nextLine();
            if(conti.equals("Y")||conti.equals("y")){
            continue;
            }else if(conti.equals("N")||conti.equals("n")){
             break;
            }
            
        }

        System.out.println("---------------------------------------------");
        
        
        for(int i=0;i<arr.length;i++){
           
                System.out.printf("%s  %s %s ~ %s \n",arr[i].tname, arr[i].maxp, arr[i].startd, arr[i].endd);
           }
    }
}