package polymorph;

public abstract class Shape {
    protected String color;

    public Shape(String color){
        this.color = color;
    }

    //abstract method
    public abstract double calculateArea();

    //concrete method
    public  void displayInfo(){
        IO.println("Color: " + this.color);
        IO.println("Area: " + calculateArea());
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}


class Trapezoid extends Shape{
    private double baseA, baseB, height;

    public Trapezoid(String color, double baseA, double baseB, double height){
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public double calculateArea(){
        return (baseA + baseB) / 2 * height;
    }
}

class ShapeDemo{

    static void main() {
        //Shape s = new Shape("blue");
        Circle c = new Circle("yellow", 4);
        Trapezoid t = new Trapezoid("red", 4, 7, 3);
        Shape[] shapes = {c, t, new Circle("blue", 2.5)};
        for(Shape s : shapes){
            s.displayInfo();
        }
    }
}