package uml;

public class Student {
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    private static int studentCount = 0;

    public Student(String name, int age, String studentId, double gpa) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("Invalid age");
            return;
        }
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa < 0 && gpa > 100){
            System.out.println("Invalid GPA");
            return;
        }
        this.gpa = gpa;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void displayInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(studentId);
        System.out.println(gpa);
    }

    public static int getTotalStudents(){
        return studentCount;
    }
}
