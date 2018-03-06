package step02;
import java.util.Scanner;

public class Rnr{

	public static void main(String[]args){
	
	int name [] = new int [5];
	int kor [] = new int [5];
	int eng [] = new int [5];
	int math[] = new int [5];
	int sum [] = new int [5];
	int avg[] = new int [5];
	char p [] = new char[5];
	int korsum =0, engsum=0, mathsum=0;
	int i=0;
	int max =0, min =100;
	int koravg=0, engavg=0, mathavg=0;
	
 	int pc = 0, fc = 0;
	int maxnumber=0,minnumber=0;

	Scanner key = new Scanner(System.in);

	for(i=0; i<5; i++){

	System.out.printf(" 번호 ");
	name[i] = key.nextInt();


	System.out.printf(" 국어 ");
	kor[i] = key.nextInt();

	
	System.out.printf(" 영어 ");
	eng[i] = key.nextInt();

	
	System.out.printf(" 수학 ");
	math[i] = key.nextInt();
	
	System.out.println("");
	
	
	sum[i] = kor[i] + eng[i] + math[i];
	avg[i] = sum[i] / 3;	

	if (avg[i] >= 80){
 	  p[i] = 'p';
  	 pc++;
 	 }
 	
	 else if (avg[i] < 80){
   	p[i] = 'f';
   	fc++;
 }
  	
	if (max < avg[i]){
  	 max = avg[i];
  	 maxnumber = i + 1;
   	
 }
	  if (min > avg[i]){
  	 min = avg[i];
  	 minnumber = i + 1;
   	
  	 
  }
  
}


	System.out.println("---------------------");

	for(i=0; i<5; i++){
	
	korsum += kor[i];           
	engsum = eng[i] + engsum;  
	mathsum = math[i] + mathsum;

	koravg = korsum/5;
	engavg = engsum/5;
	mathavg = mathsum/5;
	
	System.out.printf("번호 %d 국어:%3d 영어:%3d 수학:%3d 총점:%3d 평균%4d\n",name[i],kor[i],eng[i],math[i],sum[i],avg[i]);
												//번호는 i+1;이라고 줘도댐 for에서 0부터시작했으니까
}


	System.out.println("----------------------------------------------");
	System.out.printf("합격인원 = %d 불합격 인원=%d\n", pc, fc);
	System.out.printf("최고평균점수=%d 번호는=%d 최저평균점수=%d 번호는 =%d\n", max, maxnumber, min, minnumber);
	System.out.printf("국어총점:%d, 영어총점:%d, 수학총점:%d\n",korsum,engsum,mathsum);
	System.out.printf("국어평균점수%d,영어평균점수%d,수학평균점수%d" ,koravg, engavg, mathavg);
} 
}
	
	