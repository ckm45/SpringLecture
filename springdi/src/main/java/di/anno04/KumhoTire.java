package di.anno04;

import org.springframework.stereotype.Component;

@Component
public class KumhoTire implements Tire {

    @Override
    public String getTireBrand() {
        
        return "금호타이어";
    }

}
