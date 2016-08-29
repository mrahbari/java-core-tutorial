package classes;

/**
 * Created by mrahbari on 05/30/2015.
 */
public class Printer {
    public boolean isOn = true;
    public String modelName;

    /**
     *  print is on variable
     */
    public void printIsOn(){
        System.out.println(this.isOn);
    }

    /**
     *  print model name
     */
    public void printModelName(){
        System.out.println(this.modelName);
    }

    public void print(String text){

        if (text.isEmpty())
            System.out.println("your parameter is empty");
        else
            System.out.println(text);
    }
}
