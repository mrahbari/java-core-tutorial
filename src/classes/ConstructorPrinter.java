package classes;

/**
 * Created by mrahbari on 05/30/2015.
 */
public class ConstructorPrinter {
    public boolean isOn = true;
    public String modelName;

    /**
     * constructor should be without void, ...
     * @param isOne
     * @param modelName
     */
    public ConstructorPrinter(boolean isOne, String modelName) {
        this.isOn = isOne;
        this.modelName = modelName;
    }

    public void print(){
        System.out.println(this.isOn);
        System.out.println(this.modelName);
    }

    public String returnModelName(){
        return this.modelName;
    }
}
