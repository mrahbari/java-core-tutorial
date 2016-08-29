package collections;

import java.lang.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by mrahbari on 06/02/2015.
 */
public class TestUserDefinedArrayListClass {

    public static void main(String argv[]) {

        //Creating user-defined class objects
        Student s1 = new Student(101, "Sonoo", 23);
        Student s2 = new Student(102, "Ravi", 21);
        Student s3 = new Student(103, "Hanumat", 25);


        ArrayList<Student> li = new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);

        Iterator<Student> itr = li.iterator();
        while (itr.hasNext()) {
            Student st=(Student)itr.next();
            System.out.println(st.id+" "+st.name+" "+st.age);
        }

    }
}
