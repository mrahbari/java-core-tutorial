package multithreading;

/**
 * Created by mrahbari on 06/09/2015.
 */
public class TestInheritClass {

    public static void main(String[] argv) {

        // first way to use thread
        InheritClass it = new InheritClass();
        it.start(); // start the thread

        InheritClass it2 = new InheritClass();
        it2.start(); // start the thread

        for (int i = 0; i <= 100; i++)
            System.out.println("Test Inherit Thread no " + i);

        // second way to run thread

    }
}
