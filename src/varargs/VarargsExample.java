package varargs;

/**
 * Created by mrahbari on 6/12/2017.
 */
public class VarargsExample {

    public void displayData(String... values) {
        System.out.println("Number of arguments passed " + values.length);
        for (String s : values) {
            System.out.println(s + " ");
        }
    }

    public static void main(String[] args) {
        VarargsExample vObj = new VarargsExample();
        // four args
        vObj.displayData("var", "args", "are", "passed");
        //three args
        vObj.displayData("Three", "args", "passed");
        // no-arg
        vObj.displayData();
    }

    /*Output

    Number of arguments passed 4
    var
            args
    are
            passed
    Number of arguments passed 3
    Three
            args
    passed
    Number of arguments passed 0*/
}
