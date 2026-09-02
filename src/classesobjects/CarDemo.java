package classesobjects;

public class CarDemo {
    static void main() {
        Car myCar = new Car("toyota", "vios");
        myCar.displayInfo();
        Car anotherCar = new Car();
        anotherCar.displayInfo();
    }
}
