package step02.assignment;
import java.util.Scanner;


		// 6단계: 형식을 갖춘 문자열 출력하기.
		public class Test02_4 {
			public static void main(String[] args) {

				String[] name = new String[5];
				int [] kor = new int[5];
				int [] eng = new int[5];
				int [] math = new int[5];
				int [] sum = new int[5];
				float [] average = new float[5];

				java.io.InputStream keyboard = System.in;
				java.util.Scanner keyScan = new java.util.Scanner(keyboard);
				
				for(int i=0; i<5; i++){
				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				name[i] = keyScan.next();
				kor[i] = keyScan.nextInt();
				eng[i] = keyScan.nextInt();
				math[i] = keyScan.nextInt();
		
				sum[i] = kor[i] + eng[i] + math[i];
				average[i] = sum[i] / 3;
				}
				
				
		
				System.out.println("------------------------------");

				for(int i=0; i<5; i++){
				System.out.printf("%s %d %d %d %d %f \n",name[i],kor[i],eng[i],math[i],sum[i],average[i]);
				
				System.out.println();
				}
				
			}
		}
		
	
	

	

