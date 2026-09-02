package classesobjects;

public class Car {
    String maker;
    String model;
    short year;
    boolean isAutomatic;
    int mileage;
    short speed;

    //def constructor
    Car(){
        maker = "";
        model = "";
        year = 0;
        isAutomatic = false;
        mileage = 0;
        speed = 0;
    }

    //parameterized
    Car(String maker, String model){
        this.maker = maker;
        this.model = model;
    }

    void displayInfo(){
        System.out.println(maker);
        System.out.println(model);
    }
}
