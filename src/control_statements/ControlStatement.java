package control_statements;

import java.util.*;

/**
 * Created by mrahbari on 05/30/2015.
 */
public class ControlStatement {

    public static void main(String argv[]) {

        // define variable
        boolean number = false;
        char grade = 'A';

        // define condition
        System.out.println("\n\n" + "IF:");
        if (number)
            System.out.println("The result is true!");
        else
            System.out.println("The result is false!");

        // define switch
        System.out.println("\n\n" + "SWITCH:");
        switch (grade) {
            case 'A':
                System.out.println("the grade is A!");
                break;
            case 'B':
                System.out.println("the grade is B!");
                break;
            case 'C':
                System.out.println("the grade is C!");
                break;
            default:
                System.out.println("none of them!!");
        }

        // loop statement
        System.out.println("\n\n" + "FOR:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
            System.out.print(" ");
        }

        // loop statement with foreach
        System.out.println("\n\n" + "FOREACH:");
        String[] colors = new String[]{"Red", "Blue", "Pink"};
        String[] colors2 = {"Red", "Blue", "Pink"};
        for (String currentColors : colors2) {
            System.out.print(currentColors);
            System.out.print(" ");
        }

        // Dynamic Array
        int arr[] = {12, 13, 14, 44};
        for (int i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }

        // Array list sample
        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("vimal");
        list3.add("sonoo");
        list3.add("ratan");

        for (String s : list3) {
            System.out.println(s);
        }

        // loop statement whit while
        System.out.println("\n\n" + "WHILE:");
        int i = 0;
        while (i <= 10) {
            System.out.print(i);
            System.out.print(" ");
            i++;

            if (i == 7)
                break;
        }


    }
}
