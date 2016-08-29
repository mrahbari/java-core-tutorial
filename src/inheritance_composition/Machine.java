package inheritance_composition;

import classes.Printer;

/**
 * Created by mrahbari on 05/30/2015.
 */
public class Machine extends Printer {

    public boolean isOn = false;

    // check super keyword
    public void superTest(){
        System.out.print("the value of isOn with super keyword is:");
        System.out.println(super.isOn);
    }

    // check super keyword
    public void notSuperTest(){
        System.out.print("the value of isOn without super keyword is:");
        System.out.println(isOn);
        System.out.println(" OR ");
        System.out.println(this.isOn);
    }

    public static void main(String argv[]){
        Machine myMachine = new Machine();

        // check super keyword usage
        myMachine.superTest();
        myMachine.notSuperTest();

        // sample of inheritance
        myMachine.modelName = "Turbo Machine";
        myMachine.printModelName();

        myMachine.isOn = false;
        myMachine.printIsOn();
    }


}
