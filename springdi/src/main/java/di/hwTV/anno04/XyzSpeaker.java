package di.hwTV.anno04;

import org.springframework.stereotype.Component;

@Component("xyz")
public class XyzSpeaker implements Speaker {

    @Override
    public void volumeup() {
        // TODO Auto-generated method stub
        System.out.println("볼륨을 높입니다.");
    }

    @Override
    public void volumedown() {
        // TODO Auto-generated method stub
          System.out.println("볼륨을 낮춥니다.");
    }

    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        return "XyzSpeaker";
    }
}
