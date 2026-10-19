package polymorph;

public abstract class AbstractAnimal {
    private String breed;

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getBreed(){
        return this.breed;
    }

    public abstract void makeSound();
}

class Aso extends AbstractAnimal{
    public void makeSound(){
        IO.println("arf arf");
    }
}

class Pusa extends AbstractAnimal{
    public void makeSound(){
        IO.println("meow");
    }
}

class AbstractAnimalDemo{
    static void main() {
        Aso a = new Aso();
        IO.print(a);
    }
}
