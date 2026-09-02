package classesobjects;

public class StudentDemo {
    static void main() {
        //create instance
        //class obj = new constructor();
        Student s1 = new Student();

        //invoke
        s1.name = "jericho";
        s1.recite();
        Student s2 = new Student();
        s2.recite();
    }
}
