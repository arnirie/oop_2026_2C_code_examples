package classesobjects;

import java.util.ArrayList;
import java.util.Scanner;

class TeacherDemo{
    static void main() {
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        Scanner sc = new Scanner(System.in);
        String search = "";
        while(true){
            System.out.print("Do you want to add a teacher? <y/n> ");
            if(sc.nextLine().equalsIgnoreCase("n")) break;
            //if yes, add
            Teacher t = new Teacher();
            System.out.print("Enter name: ");
            t.setName(sc.nextLine());
            System.out.print("Enter specialization: ");
            t.setSpecialization(sc.nextLine());
            System.out.print("Enter years of service: ");
            t.setYearsOfService(sc.nextInt());
            sc.nextLine();
            teachers.add(t);
        }
        //display
        System.out.println("All entered teachers");
        for(Teacher t : teachers){
            t.displayOnOneLine();
        }

        System.out.print("Enter a name to delete:");
        search = sc.nextLine();
//        //search algo
        boolean isFound = false;
//        for(Teacher t : teachers){
//            if(t.getName().toLowerCase().contains(search.toLowerCase())){
//                isFound = true;
//                t.displayOnOneLine();
//            }
//        }
//        if(!isFound) System.out.println(search  + " is not found");
        //delete
        Teacher toDelete = null;
        for (Teacher t : teachers){
            if(t.getName().toLowerCase().contains(search.toLowerCase())){
                toDelete = t;
                isFound = true;
                break;
            }
        }
        if(isFound) {
            teachers.remove(toDelete);
        }

        System.out.println("Final List");
        for(Teacher t : teachers){
            t.displayOnOneLine();
        }
    }
}

public class Teacher {
    String name;
    String specialization;
    int yearsOfService;

    public Teacher(){
        name = "";
        specialization = "";
        yearsOfService  = 0;
    }

    public Teacher(String name, String specialization, int yearsOfService) {
        this.name = name;
        this.specialization = specialization;
        this.yearsOfService = yearsOfService;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public void displayOnOneLine(){
        System.out.printf("%s\t\t\t%s\t\t\t%d\n", this.name, this.specialization, this.yearsOfService);
    }
}
