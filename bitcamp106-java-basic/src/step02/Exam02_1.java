// 키보드 입력받기

package step02;
 
public class Exam02_1 {
    public static void main (String[] args){
        //키보드 정보를 가져온다.
        java.io.InputStream keyboard = System.in;

        //키보드에서 값을 꺼내주는 도구를 연결한다.
        java.util.Scanner keyScan =new java.util.Scanner(keyboard);

        // printf()는 문자열을 출력한후 줄바꿈을 하지않는다.   
        System.out.print("팀명?");
        // nextLine()
        //Scanner 도구를 사용하여 키보드로부터 입력된 데이터를 읽어서
        // 한줄의 문자열을 가져올때 사용하는 명령어다.
        // 사용자가 한줄 입력할대까지 즉 입력 데이터에 줄바꿈하는 의미하는 0d0a 2바이트가 들어올 때까지 대기한다.
        // 사용자가 엔터키를 누르면 입력값0d0a 2바이트 값이 들어오고 nextLine() 비로서 사용자가 입력한 값을 리턴한다.
        // 그리고 곧 바로 println()을 사용하여 화면(콘솔)으로 출력한다.
        System.out.println(keyScan.nextLine());
    }
    }

    // System.out 표준 출력장치
    // 콘솔(모니터,명령창) 출력을 가르킨다.
    // System.in 표준 입력장치
    // 키보드를 가르킨다.
