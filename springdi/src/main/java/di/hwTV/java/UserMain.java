package di.hwTV.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        TV tv = (TV) context.getBean("S", TV.class);
        tv.volumeup();
        tv.turnoff();
        tv.printSpeakerBrand();
    }
}
