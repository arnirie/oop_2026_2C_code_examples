package inheritance;

public class Vehicle {
    protected String make;
    protected String model;
    protected double speed;
    protected double mileage;
    protected boolean isRunning;

    {
        this.speed = 0;
        this.mileage = 0;
        this.isRunning = false;
    }

    public Vehicle(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public void setMake(String make){
        this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void startEngine(){
        this.isRunning = true;
    }

    public void stopEngine(){
        stop();
        this.isRunning = false;
    }

    public void stop(){
        this.speed = 0;
    }

    public void accelerate(int speed){
        this.speed = speed;
    }

    public void displayStat(){
        IO.println(make);
        IO.print(speed);
    }
}

class EVCar extends Vehicle{
    private int numberofDoors;
    private boolean isSedan;
    private String transmission;

    {
        numberofDoors = 0;
        isSedan = true;
    }

    public EVCar(String make, String model, String transmission){
        super(make, model);
        this.transmission = transmission;
    }

    public int getNumberofDoors() {
        return numberofDoors;
    }

    public void setNumberofDoors(int numberofDoors) {
        this.numberofDoors = numberofDoors;
    }

    @Override
    public void displayStat(){
        System.out.println(super.make);
        System.out.println(super.speed);
        IO.println(numberofDoors);
        IO.println(isSedan);
        IO.println(transmission);
    }

    @Override
    public void accelerate(int speed){
        super.speed = speed * 1.5;
    }
}
