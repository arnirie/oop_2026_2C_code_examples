package classesobjects;

import java.util.ArrayList;

public class StudentDemo {
    static void main() {
        //arraylist
        //ArrayList obj = new ArrayList();
        ArrayList<StudentNew> list = new ArrayList<StudentNew>();
        StudentNew s = new StudentNew();
        list.add(s);
        list.add(new StudentNew("rie",6,"45",5.6));
        System.out.println(list.toArray().length);
    }
}
