package midterm;

public class Dog extends Pet{
    private String breed;
    private boolean isHouseTrained;

    public Dog(String name, int age, double adoptionFee, int daysInShelter, String breed, boolean isHouseTrained){
        super(name, age, adoptionFee, daysInShelter);
        this.breed = breed;
        this.isHouseTrained = isHouseTrained;
    }

    public double calculateDiscountedFee(){
        //Dogs: 10% off if house trained, 15% additional off if in shelter more than 30 days
        double aFee = super.getAdoptionFee();
        if(isHouseTrained) aFee -= aFee * 0.1;
        if(getDaysInShelter() > 30) aFee -= aFee * 0.15;
        return aFee;
    }

    public boolean isHouseTrained(){
        return this.isHouseTrained;
    }

    public String getBreed(){
        return this.breed;
    }

    @Override
    public String getCareLevel(){
        if(this.getAge() > 7) return "Senior Care";
        else if(!isHouseTrained) return "Training Required";
        else return "Standard Care";
    }
}
