package di.hwTV.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("S")
public class SamsungTV implements TV {
    private Speaker leftSpeaker;
    private Speaker rightSpeaker;


    @Autowired
    public SamsungTV(@Qualifier("abc") Speaker leftSpeaker,
            @Qualifier("xyz") Speaker rightSpeaker) {
        System.out.println("samsung 생성자");
        this.leftSpeaker = leftSpeaker;
        this.rightSpeaker = rightSpeaker;
    }

    public Speaker getLeftSpeaker() {
        return leftSpeaker;
    }



    public void setLeftSpeaker(Speaker leftSpeaker) {
        this.leftSpeaker = leftSpeaker;
    }



    public Speaker getRightSpeaker() {
        return rightSpeaker;
    }



    public void setRightSpeaker(Speaker rightSpeaker) {
        this.rightSpeaker = rightSpeaker;
    }

    @Override
    public void turnon() {

        System.out.println("Samsung TV를 켭니다.");
    }

    @Override
    public void turnoff() {

        System.out.println("Samsung TV를 끕니다.");
    }

    @Override
    public void volumeup() {

        System.out.println("왼쪽 스피커 " + leftSpeaker.getBrand()) ;
        leftSpeaker.volumeup();
        System.out.println("오른쪽 스피커 " + rightSpeaker.getBrand());
        rightSpeaker.volumeup();
        
    }

    @Override
    public void volumedown() {

        System.out.println("왼쪽 스피커 " + leftSpeaker.getBrand()) ;
        leftSpeaker.volumedown();
        System.out.println("오른쪽 스피커 " + rightSpeaker.getBrand());
        rightSpeaker.volumedown();
    }

    @Override
    public void printSpeakerBrand() {
        System.out.println("왼쪽 스피커 " + leftSpeaker.getBrand()) ;
        System.out.println("오른쪽 스피커 " + rightSpeaker.getBrand());
    }

}
