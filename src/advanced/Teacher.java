package advanced;

public class Teacher {
    private String name;
    private int age;

    public Teacher setName(String name){
        this.name = name;
        return this;
    }

    public Teacher setAge (int age){
        this.age = age;
        return this;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public void displayT(){
        TeacherTrainee.displayTrainee(this);
    }
}

class TeacherTrainee {
    public static void displayTrainee(Teacher teach){
        teach.display();
    }
}

class TeacherDemo{
    static void main() {
        Teacher t = new Teacher();
        t.setAge(5).setName("arni");
        t.displayT();
    }
}
