// 클래스 용도 - 사용자 정의 데이터 타입 만들 때 사용

package step07;

public class ExamX_1 {
    public static void main(String[] args){
//사용자 정의 데이터 타입을 사용하는 방법
// => new 명령을 사용하여 설계도에 기술된 대로 메모리를 준비한다.
// => 메모리는 Heap 영역에 생성된다.
// => 메모리 주소를 레퍼런스(주소 변수)에 저장한다.
        Score score = new Score();  // 클래시이름은 대문자고 인스턴스는 소문자로 시작한다.

        //클래스로 만든 메모리는 레퍼런스를 통해 접근한다.
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 90;
        score.math = 85;
        score.sum = score.kor + score.eng + score.math ;
        score.average = (float)score.sum / 3f;

        System.out.printf("%s, %d %d %d %d %.1f\n",score.name, score.kor, score.eng, 
                score.math,score.sum,score.average);
        

      
}

}