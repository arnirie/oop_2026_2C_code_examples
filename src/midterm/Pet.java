package midterm;

public class Pet {
    private String name;
    private int age;
    private double adoptionFee;
    private int daysInShelter;
    private static int petCount;

    static {
        petCount = 0;
    }

    public Pet(String name, int age, double adoptionFee, int daysInShelter) {
        this.name = name;
        this.age = age;
        this.adoptionFee = adoptionFee;
        this.daysInShelter = daysInShelter;
        petCount++;
    }

    public double getAdoptionFee() {
        return adoptionFee;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getDaysInShelter() {
        return daysInShelter;
    }

    public static int getPetCount() {
        return petCount;
    }

    public String getCareLevel(){
        return "Standard Care";
    }

    public boolean isOlderThan(Pet other){
        if(other == null) return false;
        //return true if own age > other's age
//        if(this.age > other.age) return true;
//        else return false;
        return this.age > other.age;
    }
}

class PetDemo{
    static void main() {
        Dog dog = new Dog("choco", 1, 1500, 20, "aspin", false);
        Cat cat = new Cat("kuting", 2, 5000, 5, "orange", true);
        Pet[] pets = {dog, cat};
        for(Pet p : pets){
            IO.println(p.getName());
        }
    }
}





















