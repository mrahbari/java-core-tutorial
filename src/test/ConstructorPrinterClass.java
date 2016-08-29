/**
 * Created by mrahbari on 05/30/2015.
 */
package test;
import classes.ConstructorPrinter;

public class ConstructorPrinterClass {

    public static void main(String argv[]) {
        ConstructorPrinter myPrinter =new ConstructorPrinter(true, "With Constructor");
        myPrinter.print();

        myPrinter.modelName = "Set Model name manually";
        System.out.println(myPrinter.returnModelName());
    }
}
