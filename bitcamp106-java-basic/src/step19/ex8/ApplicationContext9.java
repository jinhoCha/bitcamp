// 객체를 저장할 때 클래스 이름으로 저장하고 클래스 이름으로 꺼낼 수 있다.
package step19.ex8;

import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;
import java.net.URL;
import java.util.HashMap;

public class ApplicationContext9 {
    // 클래스 이름으로 객체를 저장할 수 있도록 Map 을 사용한다.
    private HashMap<String,Object> objPool = new HashMap<>();
    
    public ApplicationContext9(String packageName) throws Exception {
        String path = packageName.replace(".", "/");
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource(path);
        File dir = new File(url.getPath());
        if (!dir.isDirectory())
            return;
        findClasses(dir, packageName);
    }
    
    private void findClasses(File dir, String packageName) throws Exception {
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || // 디렉토리 이거나
                        (pathname.getName().endsWith(".class") && // .class 파일인 경우 
                        !pathname.getName().contains("$"))) { // 단 중첩클래스는 제외
                    return true;
                }
                return false;
            }
        });
        for (File f : files) {
            if (f.isDirectory()) {
                findClasses(f, packageName + "." + f.getName());
                continue;
            } 
            
            String classname = f.getName();    
            Class clazz = Class.forName(packageName + "." + 
                    classname.substring(0, classname.length() - 6));
            Object obj = createObject(clazz);
            if (obj != null) {
                this.objPool.put(clazz.getName(), obj);
            }
        }
    }
    
    private Object createObject(Class clazz) {
        try {
            // 파라미터가 없는 기본 생성자를 찾는다.
            clazz.getConstructor();
            return clazz.newInstance(); // 기본 생성자를 호출하여 객체를 생성한다.
        } catch (Exception e) {
            Constructor[] constructors = clazz.getConstructors();
            for (Constructor constructor : constructors) {
                Object obj = callConstructor(constructor);
                if(obj != null)
                    return obj;
            }
            return null;
        }
    }
    private Object callContructor(Constructor constructor) {
        if (containsDefaultType(constructor))
            return null;
        
        Class[] paramTypes = constructor.getParameterTypes();
        for (Class paramType : paramTypes) {
            Object paramObj = objPool.get(paramType.getName());
        }
    }
    private Object findObject(Class clazz) {
        return objPool.get(clazz.getName());
    }
    private boolean containsDefaultType(Constructor constructor) {
        Class[] defaultTypes = {
                byte.class, short.class, int.class, long.class, 
                float.class, double.class, boolean.class, char.class,
                Byte.class, Short.class, Integer.class, Long.class,
                Float.class, Double.class, Boolean.class, Character.class,
                String.class
        }; 
        // 1) 생성자의 파라미터 정보를 꺼낸다.
        Class[] paramTypes = constructor.getParameterTypes();
        
        // 2) 생성자의 파라미터 타입이 primitive 타입이거나 Wrapper, String 일 경우
        //    이 생성자를 호출할 때 값을 줘서 호출 해야 한다.
        //    문제는 어떤 값을 줘야 하는지, 예를 들어 int를 원한다면
        //    int 값으로 얼마나 줘야 하는지 여기 결정할 수 없다.
        //    그래서 이런 생성자로는 객체를 생성할 수 없다.
        //    이런 생성자인지 검사한다.
        for (Class paramType : paramTypes) {
            for (Class defaultType :defaultTypes) {
                if (paramType == defaultType)
                    return true;
            }
        }
        return false;
    }

    
    public Object getBean(String name) {
        return objPool.get(name);
    }
}




