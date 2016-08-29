package inner_class;

/**
 * Created by mrahbari on 06/07/2015.
 *
 * A class i.e. created inside a method is called local inner class in java.
 * If you want to invoke the methods of local inner class, you must instantiate this class inside the method.
 */
public class LocalInner1 {

    private int data = 30;

    void display() {
        class Local {
            void msg() {
                System.out.println("Hello Honey: " + data);
            }
        }

        Local l = new Local();
        l.msg();
    }

    public static void main(String argv[]) {
        LocalInner1 obj = new LocalInner1();
        obj.display();
    }
}
