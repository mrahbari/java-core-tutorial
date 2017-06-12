package varargs;

/**
 * Created by mrahbari on 6/12/2017.
 */
public class VarargsExample {

    // Method which has string vararg parameter
    public void displayData(String ... values){
        System.out.println("Number of arguments passed " + values.length);
        for(String s : values){
            System.out.println(s + " ");
        }
    }

    // Method which has int vararg parameter
    public void displayData(int ... values){
        System.out.println("Number of arguments passed " + values.length);
        for(int i : values){
            System.out.println(i + " ");
        }
    }

    // Method with int vararg and one more string parameter
    public void displayData(String a, int ... values){
        System.out.println(" a " + a);
        System.out.println("Number of arguments passed " + values.length);
        for(int i : values){
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        VarargsExample vObj = new VarargsExample();
        // four string args
        vObj.displayData("var", "args", "are", "passed");

        // two int args
        vObj.displayData(10, 20);

        // One String param and two int args
        vObj.displayData("Test", 20, 30);
    }

    /*Output
    Number of arguments passed 4
        var
        args
        are
        passed
    Number of arguments passed 2
        10
        20
        a Test
    Number of arguments passed 2
        20
        30
    */
}
