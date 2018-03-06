package step02.assignment;
import java.util.Scanner;

public class Avg1{
    public static void main(String[]args){
	 

	Scanner scan= new Scanner(System.in);

		int[][]a = new int[5][5];
		String[] subject = { "국어", "영어", "수학"};
	
		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.println((i+1) + "번 학생의" + subject[j] + "점수입력");
				a[i][j] = scan.nextInt();
				a[i][3] += a[i][j]; // 총점구하는
			}
				a[i][4] = a[i][3]/3; //평균 구하는식
			}

			System.out.println("국어 영어 수학 총점 평균");
			for(int i=0; i<5; i++){
				System.out.println((i+1)+" ");
				for(int j=0; j<5; j++){
					System.out.print(a[i][j]+ " ");
				}
				System.out.printf("\n");
			}
		}
}

