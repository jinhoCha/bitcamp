
// 상수 변수를 그룹 별로 클래스로 묶어 별도의 파일로 분리하여 다루기.
package step17.ex2;

//각각의 상수를 별도로 클래스로 묶어 관리하는것은 좋으나,
// 자잘한 클래스들을 별도의 파일로 분리하여 패키지 맴버 클래스로 정의하니까
// 관리하기가 매우 번거롭다.
public class Exam02_1 {

    public static void main(String[] args) {
       Product2 p = new Product2();
       p.category = Appliance.TV;
       p.name = "울트라 비전 뷰";
       p.price = 2000000;

       p.category = Book.ESSAY;
       p.category = Computer.MOUSE;
    }

}
