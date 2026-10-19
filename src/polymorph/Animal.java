package polymorph;

public class Animal {
    private String breed;

    public Animal(){
        this.breed = "";
    }

    public Animal(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void makeSound(){
        IO.println("yehey");
    }
}

class Dog extends Animal{
    public Dog(String breed){
        super(breed);
    }

    @Override
    public void makeSound(){
        IO.print("arf arf");
    }

    public void fetch(){
        IO.print("go");
    }
}

class Cat extends Animal{
    public Cat(String breed){
        super(breed);
    }

    @Override
    public void makeSound(){
        IO.println("meow meow");
    }
}

class AnimalDemo{
    static void main() {
        Animal[] animals = {new Animal(), new Cat("pusa"),
                new Dog("aspin"), new Dog("shitzu"), new Cat("persian")};
        IO.println(animals.length);
        for(Animal a : animals){
            a.makeSound();
        }

    }

}