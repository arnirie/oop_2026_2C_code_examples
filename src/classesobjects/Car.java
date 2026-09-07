package classesobjects;

public class Car {
    static String maker;
    String model;
    short year;
    boolean isAutomatic;
    int mileage;
    private short speed;

    public short getSpeed(){
        return this.speed;
    }

    public void setSpeed(short speed){
        if(speed < 0){
            System.out.println("enter valid speed");
            return;
        }
        this.speed = speed;
    }

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

    static void displayMaker(){
        System.out.println(maker);
    }
}
