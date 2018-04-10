//
// 애노테이션 프로퍼티 - value 프로퍼티
// = > SOURCE : 소스 파일에만 남긴다. 컴파일 후 제거된다.
// = > CLASS : class 파일에 남긴다. 그러나 실행 시에 추출할 수 없다.
// => RUNTIME : .class 파일에 낙민다. 실행 시에 추출할 수 있따.
package step20.ex4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    String value();
                 
}
