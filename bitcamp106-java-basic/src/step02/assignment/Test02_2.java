package step02.assignment;
import java.util.Scanner;


		// 2단계: 여러 명의 성적 정보를 받아서 처리하기
		public class Test02_2 {
			public static void main(String[] args) {

				String[] name = new String[5];
				int [] kor = new int[5];
				int [] eng = new int[5];
				int [] math = new int[5];
				int [] sum = new int[5];
				float [] average = new float[5];

				java.io.InputStream keyboard = System.in;
				java.util.Scanner keyScan = new java.util.Scanner(keyboard);

				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				name[0] = keyScan.next();
				kor[0] = keyScan.nextInt();
				eng[0] = keyScan.nextInt();
				math[0] = keyScan.nextInt();
		
				sum[0] = kor[0] + eng[0] + math[0];
				average[0] = sum[0] / 3;
				
				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				name[1] = keyScan.next();
				kor[1] = keyScan.nextInt();
				eng[1] = keyScan.nextInt();
				math[1] = keyScan.nextInt();
		
				sum[1] = kor[1] + eng[1] + math[1];
				average[1] = sum[1] / 3;

				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				name[2] = keyScan.next();
				kor[2] = keyScan.nextInt();
				eng[2] = keyScan.nextInt();
				math[2] = keyScan.nextInt();
		
				sum[2] = kor[2] + eng[2] + math[2];
				average[2] = sum[2] / 3;

				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				name[3] = keyScan.next();
				kor[3] = keyScan.nextInt();
				eng[3] = keyScan.nextInt();
				math[3] = keyScan.nextInt();
		
				sum[3] = kor[3] + eng[3] + math[3];
				average[3] = sum[3] / 3;

				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				name[4] = keyScan.next();
				kor[4] = keyScan.nextInt();
				eng[4] = keyScan.nextInt();
				math[4] = keyScan.nextInt();
		
				sum[4] = kor[4] + eng[4] + math[4];
				average[4] = sum[4] / 3;

				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				name[5] = keyScan.next();
				kor[5] = keyScan.nextInt();
				eng[5] = keyScan.nextInt();
				math[5] = keyScan.nextInt();
		
				sum[5] = kor[5] + eng[5] + math[5];
				average[5] = sum[5] / 3;
				
		
				System.out.println("------------------------------");
				for(int i=0; i<5; i++){
				System.out.println(name[i],"\n");
				System.out.print(kor[i] + "\n ");
				System.out.print(eng[i] + "\n ");
				System.out.print(math[i] + "\n ");
				System.out.print(sum[i] + "\n ");
				System.out.print(average[i] + "\n ");
				}
				System.out.println();
				}
				
			}
		
	
	

	

