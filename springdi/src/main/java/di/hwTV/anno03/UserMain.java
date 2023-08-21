package di.hwTV.anno03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class UserMain {
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("tv-anno03.xml");;
        TV tv = (TV) context.getBean("S", TV.class);
        tv.volumeup();
        tv.turnoff();
        tv.printSpeakerBrand();
    }
}
