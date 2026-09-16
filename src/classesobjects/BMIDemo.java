package classesobjects;

import java.util.Scanner;

public class BMIDemo {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String n = sc.nextLine();
        BMI bmi = new BMI(w, h);
        bmi.setName(n);
        bmi.displayBMI();
    }

}

class BMI{
    private double weight;
    private double height;
    private String name;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
        this.name = "";
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBMI(){
        return weight / (height * height);
    }

    public void displayBMI(){
        System.out.printf("BMI: %.2f", getBMI());
    }
}


