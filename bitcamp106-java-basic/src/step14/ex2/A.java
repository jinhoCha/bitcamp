package step14.ex2;

public interface A {
    // 인터페이스에 정의하는 메서드는 호출 규칙이다.
//    규칙은 공개되어야 한다.
//    그래서 인터페이스에 선언되는 모든 메서드는 public이다.
    
    public void m1();
    
//    => 무조건 public이기 떄문에 생략해도 된다.
        void m2(); // public이 생략된것이다. (default)가 아니다. 없다.
       
//        => private,protected,(default)는 없다.
//        private void m3(); 
//        protected void m4(); 컴파일 오류
}
