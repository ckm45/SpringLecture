package di.hwCalc.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class UserMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MyCalculator myCalc = (MyCalculator) context.getBean("my", MyCalculator.class);
        myCalc.printResult();
    }
    
}
