package classesobjects;

public class StudentNew {
    private String name;
    private int age;
    private String studentId;
    private double gpa;
    private static int studentCount = 0;

    public StudentNew() {
        name = "";
        age = 0;
        studentId = "";
        gpa = 0;
        studentCount++;
    }

    public StudentNew(String name, int age, String studentId, double gpa) {
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
        if(age > 0) this.age = age;
        else System.out.println("Invalid age input.");
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
        this.gpa = gpa;
    }

    public void study(){
        System.out.println(this.name + " is studying");
    }

    public static int getTotalStudents(){
        return studentCount;
    }
}
