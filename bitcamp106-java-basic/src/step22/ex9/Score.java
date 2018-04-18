package step22.ex9;

import java.io.Serializable;

public class Score implements Serializable{

    private static final long serialVersionUID = 1L;
    
    //인스턴스 변수의 구분
    // => name, kor, eng, math는 사용자가 입력한 값을 저장하는 변수.
    String name;
    int kor,eng,math;
    
    // => sum, aver는 위의 변수를 계산해서 그 결과를 저장하는 변수
    // 이렇게 다른 인스턴스 변수의 값을 가지고 계산한 결과를 저장하는 변수인 경우
    // Serialize 대상에서 제외해야한다.
    // 값의 왜곡을 막기 위함이다.
    // sum aver는 어떻게 처리??~
    // => serialize 데이터를 읽는 쪽에서 데이터를 다 읽은후에 계산을 수행해서 값을 처리해야한다.
    // 그래야만 데이터 왜곡을 막을 수 있다.
    
    // 데이터왜곡? kor.eng,math에 저장된 값과 sum aver에 저장된 값이 일치하지 않는 경우를 말한다.
    // ㅣㅇ런변수는 serialize 대상에서 제외해야 하는데,
    // 그명령어가 transient(일시적인)이다.
    //
    transient int sum;
    transient float aver;
    
    public Score() {
        System.out.println("Score()");
    }
    
    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum/3f;
    }

    @Override
    public String toString() {
        return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", aver="
                + aver + "]";
    }

    
}
