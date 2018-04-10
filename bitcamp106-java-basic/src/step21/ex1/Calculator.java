package step21.ex1;

public class Calculator {
    public static int compute(String op, int a, int b) {
        switch(op) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return a / b;
        case "%": return a % b;
        default:
            //만약 유효한 연산자가 아닐 경우 계산 결과는?
            return -1;
        }
    }
}