package step18.ex6;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;

public class Exam01 {
    public static void main(String[] args) throws Exception {
        //1)CLASSPATH를 뒤져서 파일을 찾아줄 객체를 얻는다.
        //=> ClassLoader
        
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        
        //2) 클래스 로더를 이용하여 특정 패키지나 클래스의 절대 경롤를 알아낸다.
        //클래스 로더는 디렉토리나 파일을 찾을 떄 JVM 에 지정된 CLASSPATH에서 찾는다.
        // 따라서 프로그램을 작성할 때 해당 패키지나 파일이 있는 경로를
        // 코드에 지정할 필요가 없어 편리하다.
        // => 자원의 위치는 경로를 지정할 때 . 대신 / 를 사용하라
        Enumeration<URL> resources = classLoader.getResources("step18");
        while(resources.hasMoreElements()) {
            URL url = resources.nextElement();
            System.out.println(url.getPath());
            
            File file = new File(url.getPath());
            File[] list = file.listFiles();
            for (File f : list) {
                System.out.println(f.getName());
            }
            
        }
    }
}
