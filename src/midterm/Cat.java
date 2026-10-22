package midterm;

public class Cat extends Pet{
    private String color;
    private boolean isIndoorOnly;

    public Cat(String name, int age, double adoptionFee, int daysInShelter, String color, boolean isIndoorOnly){
        super(name, age, adoptionFee, daysInShelter);
        this.color = color;
        this.isIndoorOnly = isIndoorOnly;
    }

    public double calculateDiscountedFee(){
        double aFee = super.getAdoptionFee();
        if(isIndoorOnly) aFee -= aFee * 0.2;
        if(getDaysInShelter() > 45) aFee -= aFee * 0.1;
        return aFee;
    }

    public String getColor() {
        return color;
    }

    public boolean isIndoorOnly() {
        return isIndoorOnly;
    }

    @Override
    public String getCareLevel(){
        if(this.getAge() >= 7) return "Senior Care";
        else return "Standard Care";
    }
}
