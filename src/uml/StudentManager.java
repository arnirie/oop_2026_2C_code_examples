package uml;

import java.util.Scanner;

public class StudentManager {
    static Student[] studentList;
    static byte studentMax = 3;

    static void main() {
        boolean toLoop = true;
        Scanner sc = new Scanner(System.in);
        char choice = 0;
        studentList = new Student[studentMax];
        while(toLoop){
            displayMenu();
            System.out.print("Choose an option: ");
            choice = sc.nextLine().toLowerCase().charAt(0);
            switch (choice){
                case 'a':
                    if(Student.getTotalStudents() == studentMax){
                        System.out.println("Student list is full.");
                        break;
                    }
                    //input
                    String name = sc.nextLine();
                    int age = sc.nextInt();
                    sc.nextLine();
                    String studentId = sc.nextLine();
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    Student s = new Student(name, age, studentId, gpa);
                    //add
                    addItem(s, 0);
                    break;
                case 'd':
                    System.out.println("Goodbye!");
                    toLoop = false;
                    break;
                default:
                    System.out.println("Invalid option response");
            }
        }
    }

    static void addItem(Student student, int index){
        studentList[index] = student;
    }

    static void displayMenu(){
        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===");
        System.out.println("A. Add Student");
        System.out.println("B. Remove Student by ID");
        System.out.println("C. Display All Students");
        System.out.println("D. Exit");

    }
}
