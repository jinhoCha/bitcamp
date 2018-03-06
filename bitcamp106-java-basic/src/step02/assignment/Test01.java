package step02.assignment;
import java.util.Scanner;

public class Test01{
    public static void main(String[]args){

	int kor=0, eng =0, mat= 0;
	int tot =0;
	float avg = 0;
	
	
	 
	Scanner keyboard= new Scanner(System.in);

	System.out.println("국어");
	kor=keyboard.nextInt();//정수 입력
							//이전에 국어점수를 입력받을때 들어온 줄바꿈 코드는
							// nextInt() 메서드에서 버린다.
	System.out.println("영어");
	eng=keyboard.nextInt();//정수 입력

	System.out.println("수학");
	mat=keyboard.nextInt();//정수 입력


 	System.out.println("국어점수 " +kor);
	System.out.println("영어점수 " +eng);
	System.out.println("수학점수 " +mat);

	tot = kor + eng + mat;

	System.out.println("총점 " +tot);
	avg = tot/3;

 	
 	System.out.println("평균=" +avg);
	


	
}
}