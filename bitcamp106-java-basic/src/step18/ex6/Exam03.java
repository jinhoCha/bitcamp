package step18.ex6;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.Enumeration;

public class Exam03 {
    public static void main(String[] args) throws Exception {
        //1)CLASSPATH를 뒤져서 파일을 찾아줄 객체를 얻는다.
        //=> ClassLoader
        
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource("step18/ex6");
    
            File file = new File(url.getPath());
            File[] list = file.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    if(name.endsWith(".class") && !name.contains("$"))
                            return true;
                    return false;
                    
                }
            });
            for (File f : list) {
                System.out.println(f.getName());
            }
            
        
    }

    
}