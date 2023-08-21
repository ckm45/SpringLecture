package di.hwCalc.java;

import org.springframework.stereotype.Component;

@Component("add")
public class AddCalculator implements Calculator {

    @Override
    public int calculate(int n1, int n2) {
        // TODO Auto-generated method stub
        return n1+n2;
    }

}
