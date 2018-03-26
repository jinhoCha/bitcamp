package step02.assignment;
import java.util.Scanner;

public class avg_1{
    public static void main(String[]args){

	int kor=0, eng =0, mat= 0;
	double tot =0;
	double avg = 0;
	
	
	 
	Scanner keyboard= new Scanner(System.in);

	System.out.println("국어");
	kor=keyboard.nextInt();//정수 입력

	System.out.println("영어");
	eng=keyboard.nextInt();//정수 입력

	System.out.println("수학");
	mat=keyboard.nextInt();//정수 입력


 	System.out.println("국어점수 " +kor);
	System.out.println("영어점수 " +eng);
	System.out.println("수학점수 " +mat);

	tot = kor + eng + mat;

	System.out.println("총점 " +tot);
	avg = tot/3.0;

 	
 	System.out.println("평균=" +avg);
	


	
}
}