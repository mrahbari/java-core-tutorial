package assertion;

import java.util.Scanner;

/**
 * Created by mrahbari on 06/13/2015.
 *
 * Assertion is a statement in java. It can be used to test your assumptions about the program.
 * While executing assertion, it is believed to be true.
 * If it fails, JVM will throw an error named AssertionError. It is mainly used for testing purpose.
 *
 * There are two ways to use assertion.
 *  First way is:
 *          assert expression;
 *  And second way is:
 *          assert expression1 : expression2;
 */
public class Assertion {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ur age ");

        int value = scanner.nextInt();
        assert value >= 18 : " Not valid";

        System.out.println("value is " + value);

        int a = 42;
        int d = 42;
        assert a >= 0 && d <= 10;

    }
}
