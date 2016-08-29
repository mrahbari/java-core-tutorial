package inheritance_composition;

/**
 * Created by mrahbari on 05/30/2015.
 */
public class InterfaceTest implements IPrintable, IShowable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String argv[]){
        InterfaceTest myInterface = new InterfaceTest();
        myInterface.print();
        myInterface.show();
    }
}
