package di.hwCalc.anno04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("my")
public class MyCalculator {
    int firstNum;
    int secondNum;
    Calculator calculator;

    
    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
    
    @Autowired
    public MyCalculator(@Value("5") int firstNum, @Value("3") int secondNum, @Qualifier("mul") Calculator calculator) {
        super();
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.calculator = calculator;
    }

    public void printResult() {
        System.out.println("결과는 " + calculator.calculate(firstNum,secondNum));
    }
}
