// i18n 구현
package step26.ex1;


import java.io.FileReader;
import java.util.Properties;

public class Exam01 {

    static String filename ="message";
    static Properties label;
    static String userCountry="US";
    static String userLanguage="en";

    static void init() throws Exception {

        String value =System.getProperty("country");
        if(System.getProperty("user.country") != null) 
            userCountry =System.getProperty("user.country");

            if(System.getProperty("user.language") != null) 
                userLanguage =System.getProperty("user.country");
            
        label = new Properties();
        label.load(new FileReader
                (String.format("%s-%s%s.properties", filename,userLanguage,userCountry)));
    }


    public static void main(String[] args) throws Exception {

        init();
        System.out.println(label.get("welcome"));



    }

}
