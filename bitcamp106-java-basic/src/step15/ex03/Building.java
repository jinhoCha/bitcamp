
// 디자인 패턴과 추상 클래스 - 템플릿 메서드 패턴
package step15.ex03;


//수퍼 클래스에서 추상적으로 표현하고 , 서브 클래스에서 그 구체적인 내용을 결정하는 설계 방식
// 즉 수퍼 클래스에서 전쳊거인 알고리즘 흐름을 정의하고,
// 서브 클래스에서 각흐름에 따라 구체적인 동작을 정의한다.
public abstract  class Building {
    
    public void build() {
        
        System.out.println("건축하겠습니다!");
        startEffect();
        System.out.println("건축이 완ㄹ되었습니다");
        endEffect();
    }
    
    //템플릿 메서드
    // => 아직 구체적인 코드가 정의되지 않은 상태
    public abstract void startEffect();
    public abstract void endEffect();
}
