package step18.ex6;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApplicationContext {
    
    private List<Class> classes; 
    
    public ApplicationContext(String packagename) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader(); // factory 메소드
        URL url = classLoader.getResource(packagename.replace(".", "/"));
        //패키지
        
        this.classes = findClasses(new File(url.getPath()), packagename);
    }

    static List<Class> findClasses(File dir, String packagename) throws Exception {
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                if (file.isDirectory() || 
                        (file.getName().endsWith(".class")&&                 
                        !file.getName().contains("$")))
                    return true;
                return false;
            }
        });
        
        ArrayList<Class> list = new ArrayList<>();
        for (File f : files) {
            if(f.isDirectory()) {
               list.addAll(findClasses(f,packagename + "." + f.getName()));
           //list.addAll(findClasses(f));
        } else {
           // list.add(f);
            String classname =packagename + "." + f.getName();
            // classaname = "step18.ex1.Aaa.class"
            // 전체 문자열 길이 : classname.length();
            // .class 의 인덱스 : 전체문자열 길이 - 6
            Class c = Class.forName(classname.substring(0, classname.length() -6));
            System.out.println(c.getName());
        }
        }
        return list;
    }
   }

