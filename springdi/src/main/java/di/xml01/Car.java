package di.xml01;

import java.util.List;
import java.util.Map;

public class Car {

    private Tire tire;
    private String carName;
    private int year;
    private List<String> driver;
    private Map<String, String> history;



    public Car() {
        System.out.println("Car() 생성자입니다.");
    }

    public Car(Tire t) {
        this.tire = t;
        System.out.println("Car(Tire t) 생성자입니다.");
    }

    public Car(String carName, Tire t) {
        this.carName = carName;
        this.tire = t;
        System.out.println("Car(String carName, Tire t) 생성자 입니다.");
    }

    public Car(Tire t, String carName) {
        this.carName = carName;
        this.tire = t;
        System.out.println("Car(Tire t, String carName) 생성자 입니다.");
    }

    public Car(String carName, int year, Tire t) {
        this.carName = carName;
        this.tire = t;
        this.year = year;
        System.out.println("Car(String carName, int year , Tire t) 생성자 입니다.");
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        System.out.println("setTire 호출입니다.");
        this.tire = tire;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printTireBrand() {
        System.out.println("타이어브랜드는 " + tire.getTireBrand());
    }

    public List<String> getDriver() {
        return driver;
    }

    public void setDriver(List<String> driver) {
        this.driver = driver;
    }

    public Map<String, String> getHistory() {
        return history;
    }

    public void setHistory(Map<String, String> history) {
        this.history = history;
    }
    
    
}
