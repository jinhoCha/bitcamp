package step02.assignment;
import java.util.Scanner;


		// 2단계: 여러 명의 성적 정보를 받아서 처리하기
		public class Test02 {
			public static void main(String[] args) {
				java.io.InputStream keyboard = System.in;
				java.util.Scanner keyScan = new java.util.Scanner(keyboard);
		
				

				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				String name1 = keyScan.next();
				int kor1 = keyScan.nextInt();
				int eng1 = keyScan.nextInt();
				int math1 = keyScan.nextInt();
		
				int sum1 = kor1 + eng1 + math1;
				float average1 = sum1 / 3;
		
				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				String name2 = keyScan.next();
				int kor2 = keyScan.nextInt();
				int eng2 = keyScan.nextInt();
				int math2 = keyScan.nextInt();
		
				int sum2 = kor2 + eng2 + math2;
				float average2 = sum2 / 3;
		
				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				String name3 = keyScan.next();
				int kor3 = keyScan.nextInt();
				int eng3 = keyScan.nextInt();
				int math3 = keyScan.nextInt();
		
				int sum3 = kor3 + eng3 + math3;
				float average3 = sum3 / 3;
		
				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				String name4 = keyScan.next();
				int kor4 = keyScan.nextInt();
				int eng4 = keyScan.nextInt();
				int math4 = keyScan.nextInt();
		
				int sum4 = kor4 + eng4 + math4;
				float average4 = sum4 / 3;
		
				System.out.print("입력? "); // ex) 입력? 홍길동 100 90 80
				String name5 = keyScan.next();
				int kor5 = keyScan.nextInt();
				int eng5 = keyScan.nextInt();
				int math5 = keyScan.nextInt();
		
				int sum5 = kor5 + eng5 + math5;
				float average5 = sum5 / 3;
		
				System.out.println("------------------------------");
				System.out.print(name1);
				System.out.print(" ");
				System.out.print(kor1);
				System.out.print(" ");
				System.out.print(eng1);
				System.out.print(" ");
				System.out.print(math1);
				System.out.print(" ");
				System.out.print(sum1);
				System.out.print(" ");
				System.out.print(average1);
				System.out.println();
		
				System.out.print(name2);
				System.out.print(" ");
				System.out.print(kor2);
				System.out.print(" ");
				System.out.print(eng2);
				System.out.print(" ");
				System.out.print(math2);
				System.out.print(" ");
				System.out.print(sum2);
				System.out.print(" ");
				System.out.print(average2);
				System.out.println();
		
				System.out.print(name3);
				System.out.print(" ");
				System.out.print(kor3);
				System.out.print(" ");
				System.out.print(eng3);
				System.out.print(" ");
				System.out.print(math3);
				System.out.print(" ");
				System.out.print(sum3);
				System.out.print(" ");
				System.out.print(average3);
				System.out.println();
		
				System.out.print(name4);
				System.out.print(" ");
				System.out.print(kor4);
				System.out.print(" ");
				System.out.print(eng4);
				System.out.print(" ");
				System.out.print(math4);
				System.out.print(" ");
				System.out.print(sum4);
				System.out.print(" ");
				System.out.print(average4);
				System.out.println();
		
				System.out.print(name5);
				System.out.print(" ");
				System.out.print(kor5);
				System.out.print(" ");
				System.out.print(eng5);
				System.out.print(" ");
				System.out.print(math5);
				System.out.print(" ");
				System.out.print(sum5);
				System.out.print(" ");
				System.out.print(average5);
				System.out.println();
			}
		}

	
}
}