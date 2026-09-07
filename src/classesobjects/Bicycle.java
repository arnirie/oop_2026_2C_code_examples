package classesobjects;

import java.util.Scanner;

public class Bicycle {
    private String owner;
    private int speed;
    private boolean isMountainBike;
    private double price;
    private char initial;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public char getInitial() {
        return initial;
    }

    public void setInitial(char initial) {
        this.initial = initial;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isMountainBike() {
        return isMountainBike;
    }

    public void setMountainBike(boolean mountainBike) {
        isMountainBike = mountainBike;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void displayAll(){
        System.out.println(owner);
        System.out.println(speed);
        System.out.println(isMountainBike);
        System.out.println(price);
        System.out.println(initial);
    }
}

class BikeDemo{
    static void main() {
        //array of objects
        //object
        //type[] ident = new type[size]
        Scanner sc = new Scanner(System.in);
        Bicycle[] bikes = new Bicycle[5];
        for(byte i = 0 ; i < bikes.length ; i++){
            bikes[i] = new Bicycle();
        }
        //create a loop to ask 5 names and assign to each owner field
        for(byte i = 0 ; i < bikes.length ; i++){
            System.out.println("Bike #" + (i+1));
            bikes[i].setOwner(sc.nextLine());
        }
    }
}
