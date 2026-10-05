package inheritance;

public class Employee {
    //parent/superclass
     String name;
    private String department;
    private double pay;

    {
        pay = 0;
    }

    public Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    protected final void display(){
        System.out.println(name );
        System.out.println(department);
        IO.println(pay);
    }
}

class PartTime extends  Employee{
    private int duration;

    public PartTime(String name, String department){
//        Employee();
        super(name, department);
    }

    public PartTime(String name, String department, int duration){
        super(name, department);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override //annotation
    public void display(){
        IO.println("overriden");
    }
}

class EmployeeDemo{
    static void main() {
        PartTime pt = new PartTime("arni", "it");
        Employee e = new Employee("rie", "filipino");
        e.display();
        pt.display();
    }
}