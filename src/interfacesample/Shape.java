package interfacesample;

public interface Shape {
    //contract for implementing classes

    public abstract double calculateArea();

    public abstract void displayInfo();
}

interface Resizable {
    void resize(double factor); //abstract by default

    //default method
    default void doubleSize(){
        resize(2);
    }
}

class Rectangle {
    protected double height, width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
}

class Square extends Rectangle implements Shape, Resizable{

    public Square(double side){
        super(side, side);
    }

    public double calculateArea(){
        return height * width;
    }

    public void displayInfo(){

    }

    public void resize(double factor){

    }
}

class Circle implements Shape, Resizable{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public void displayInfo(){
        IO.println("Radius: " + radius);
        IO.println("Area: " + calculateArea());
    }

    public void resize(double factor){
        this.radius *= factor;
    }

//    @Override
//    public void doubleSize(){
//        this.radius *= 10;
//    }
}

class Trapezoid implements Shape {
    private double baseA, baseB, height;

    public Trapezoid(double baseA, double baseB, double height){
                this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        return (baseA + baseB) / 2 * height;
    }

    @Override
    public void displayInfo(){
        IO.println("Trapezoid Area: " + calculateArea());
    }
}

class ShapeDemo{
    static void main() {
        Circle c = new Circle(5);
        c.doubleSize();
        c.displayInfo();
    }
}