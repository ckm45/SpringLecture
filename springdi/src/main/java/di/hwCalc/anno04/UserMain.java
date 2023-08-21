package di.hwCalc.anno04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class UserMain {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("calc-anno04.xml");
        MyCalculator myCalc = (MyCalculator) context.getBean("my", MyCalculator.class);
        myCalc.printResult();
    }
    
}
