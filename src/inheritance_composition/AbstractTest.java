package inheritance_composition;

/**
 * Created by mrahbari on 05/30/2015.
 */
public class AbstractTest extends ABike {
    void run(){
        System.out.println("running safty");
    }

    public static void main(String argv[]){
        AbstractTest myAbstract = new AbstractTest();
        myAbstract.run();
    }
}
