package exceptions;

import java.io.PrintStream;
import java.lang.*;

/**
 * Created by mrahbari on 06/01/2015.
 */
public class Exceptions {

    public void finalize() {
        System.out.println("finalize called");
    }

    public static void ageValidate(int age) {
        if (age < 18)
            throw new ArithmeticException("not valid age. It should be greater than 18!");
        else
            System.out.println("Welcome to vote!");
    }

    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String argv[]) {

        try {
            //create array of Integer, Double and Character
            Integer[] intArray = {2, 4, 5, 6, 8};
            Double[] doubleArray = {4.5, 6.1, 4.2};
            Character[] charArray = {'F', 'T', 'W', 'Q'};
            System.out.println(intArray[7]);
            System.out.println(charArray[6]);

            // may throw exception
            int data = 50 / 0;
            System.out.println("rest of the code...");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }


        // Java nested try example
        try {
            try {
                System.out.println("going to divide");
                int b = 39 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }

            try {
                int a[] = new int[5];
                a[5] = 4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }

            System.out.println("other statement");
        } catch (Exception e) {
            System.out.println("handeled");
        }

        // Usage of Java finally
        System.out.println("\n\n");
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }

        // java throw keyword example
        try {
            ageValidate(13);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        // Java Exception propagation
        Exceptions obj = new Exceptions();
        obj.p();
        System.out.println("normal flow...");
    }


}
