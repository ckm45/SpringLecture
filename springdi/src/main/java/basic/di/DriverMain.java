package basic.di;

public class DriverMain {
    public static void main(String[] args) {
        
        KumhoTire k = new KumhoTire();
        //Car car2 = new Car(new KumhoTire());
        Car car2 = new Car(k);
        car2.printTireBrand();
        
             
        //생성자를 통한 DI 
        Car car = new Car();
        HankookTire hankook = new HankookTire();
        KumhoTire kumho = new KumhoTire();
        
        //setter를 통한 DI
        car.setTire(kumho);
        car.printTireBrand();
    }
}
