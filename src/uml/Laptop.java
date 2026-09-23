package uml;

public class Laptop {
    private String model;
    private double price;
    private double discount;
    private short year;
    private static int count = 0;

    public static class Processor{
        private String maker;
        private double speed;

        public Processor(String maker, double speed) {
            this.maker = maker;
            this.speed = speed;
        }

        public String getMaker() {
            return maker;
        }

        public void setMaker(String maker) {
            this.maker = maker;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public void displayInfo(){
            System.out.println("maker " + maker);
            System.out.println("speed" + speed);
            System.out.printf("count" + count);
        }
    }

    public Laptop(){
        this.model = "";
        this.price = 0;
        this.discount = 0;
        this.year = 2000;
        count++;
    }

    public Laptop(String model){
        this.model = model;
        this.price = 0;
        this.discount = 0;
        this.year = 2000;
        count++;
    }

    public Laptop(String model, short year){
        this.model = model;
        this.price = 0;
        this.discount = 0;
        this.year = year;
        count++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public static int getAllCount() {
        return count;
    }

    public double getFinalPrice(){
        return price - price * (discount / 100);
    }
}
