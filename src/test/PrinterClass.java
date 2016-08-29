/**
 * Created by mrahbari on 05/30/2015.
 */
package test;
import classes.Printer;

public class PrinterClass {

    public static void main(String argv[]) {
        Printer myPrinter = new Printer();
        //myPrinter.isOn = false;
        myPrinter.modelName = "imported and used from Printer Class";
        myPrinter.printIsOn();
        myPrinter.printModelName();
        myPrinter.print("Hello World by Parameter");
        //System.out.println(myPrinter.isOn);
        //System.out.println(myPrinter.modelName);


        Printer yourPrinter = new Printer();
        yourPrinter.isOn = false;
        yourPrinter.modelName = "Hello World";
        yourPrinter.printIsOn();
        yourPrinter.printModelName();
        yourPrinter.print("");
        //System.out.println(yourPrinter.isOn);
        //System.out.println(yourPrinter.modelName);


    }
}
