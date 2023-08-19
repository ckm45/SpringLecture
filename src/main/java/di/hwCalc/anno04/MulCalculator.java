package di.hwCalc.anno04;

import org.springframework.stereotype.Component;

@Component("mul")
public class MulCalculator implements Calculator {

    @Override
    public int calculate(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1*n2;
    }

}
