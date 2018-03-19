// 매서드 분류 - 클래스 변수의 단점
// Calculator3를 이용
package step07;



public class ExamY_4 {
    public static void main(String[] args){
        //클래스 변수는  한개만 존재하기 떄문에
        // 여러 개의 작업을 동시에 진행할 수 없다.

        //다음 두개의 식을 분리하여 계산해 보자!
        //식1) 2 + 3 -1 * 7 / 3 = ?
        //식2) 3* 2 + 7 / 4 - 5 = ?
        
        // 두개의 식의 계산 결과를 따로 관리하기 위해서는
        // result 변수를 개별적으로 생성해야 한다.
        Calculator3 c1 = new Calculator3(); //식 1의 계산결과를 보관할 메모리준비
        Calculator3 c2 = new Calculator3(); // 식2의 계산결과를 보관할 메모리준비.
        
        // 계산을 수행할때 계산 결과가 보관할 메모리를 전달하라!
        Calculator3.plus(c1,2);
        Calculator3.plus(c2,3);
        
        Calculator3.plus(c1, 3);
        Calculator3.multiple(c2, 2);
        
        Calculator3.minus(c1, 1);
        Calculator3.plus(c2,7);
        
        Calculator3.multiple(c1, 7);
        Calculator3.divide(c2, 4);
        
        Calculator3.divide(c1, 3);
        Calculator3.minus(c2, 5);

           // 식1의 계산 결과는 c1 인스턴스의 result에 들어 있고,
           // 식2의 계산 결과는 c2 인스턴스의 result에 들어있따.
        System.out.printf("result = %d\n", c1.result);
        System.out.printf("result = %d\n", c2.result);
    }
}
