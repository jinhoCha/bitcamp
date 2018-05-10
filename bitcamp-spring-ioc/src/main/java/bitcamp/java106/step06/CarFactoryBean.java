

package bitcamp.java106.step06;

import org.springframework.beans.factory.FactoryBean;

// 스프링 IoC 컨테이너가 정한 규칙에 따라 공장 클래스를 만들면,
//  스프링 기법을 사용하여 보다 쉽게 객체를 생성할수있다   


// 스프링에서 공장 클래스를 만들 때 제안한 규칙?
// => org.
public class CarFactoryBean implements FactoryBean<Car>{
    String model;
    
    public CarFactoryBean() {
        System.out.println("CarFactory3() 생성자 호출됨.");
    }

    public void setModel(String model) {
        System.out.println("CarFactory3.setModel()호출됨.");
        this.model = model;
    }

    @Override
    public Car getObject() throws Exception {
        System.out.println("CarFactory3.Object()호출됨.");
            Car c = new Car();
            switch (model) {
            case "티코":
                c.setMaker("대우자동차");
                c.setModel("Tico");
                c.setCc(890);
                return c;
            case "소나타":
                c.setMaker("현대자동차");
                c.setModel("Sonata");
                c.setCc(1980);
                return c;
            case "SM5":
                c.setMaker("르노삼성자동차");
                c.setMaker("SM5");
                c.setCc(1990);
                return c;
            default:
                c.setMaker("비트자동차");
                c.setModel("자바휘웅");
                c.setCc(5000);
                return c;
            }
    }

    @Override
    public Class<?> getObjectType() {
        System.out.println("CarFactory3.ObjectType호출됨.");
        return Car.class;
    }
    }
    
   
