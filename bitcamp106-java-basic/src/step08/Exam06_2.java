// 초기화 블럭 - 인스턴스  블록의 활용
package step08; 

public class Exam06_2 {

    public static void main(String[] args) {

      //생성자를 이용하여 인스턴스 초기화 시킬수 있는데
        //왜,인스턴스 블록 이라는 문법이 존재하는가?
        // 생성자를 정의할 수 있는 상황이라면 인스턴스 블록은 사용할 이유가 없다.
        //
        // 생성자를 사용할 수 없는 상황에서 인스턴스 블록을
        // 사용한다는것입니까? YES!!
        // 생성자를 사용할수없는 경우가있나요? Yes!!
        // => ex)
        // 나중에 또배우니까 맛만보자
        // " 익명 클래스 "
        // => 클래스 이름이 업기 떄문에 생성자를 만들수가 없다.
        // = > 그러나 생성자처럼 꼭 기본값으로 초기화 시키고 싶다.
        Object obj1 = new Object() {
            {
            System.out.println("인스턴스 블록");
        }
            // 이클래스는 이름이 없기 떄문에 생성자를 만들수가 없다.
            // 그래서 초기화 명령을 작성하려면 인스턴스 블록을 이용해야 한다.
        };
       
        
    }
}