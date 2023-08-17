package di.xml01;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DriverMain {

    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("spring-xml01.xml");

        // 1. 생성자 주입
        // Car c1 = new Car(new HankookTire());
        Car localcar = (Car) context.getBean("car");
        localcar.printTireBrand();
        
        Car car5 = (Car) context.getBean("car5");
        List <String> list = car5.getDriver();
        for(String string : list) {
            System.out.println(string);
        }
        
        
        Car car6 = (Car) context.getBean("car6");
        Map<String,String> map = car6.getHistory();
        for (Entry<String, String> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }
 
    }

}
