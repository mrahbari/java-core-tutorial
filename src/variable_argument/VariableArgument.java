package variable_argument;

/**
 * Created by mrahbari on 06/13/2015.
 *
 * The varrags allows the method to accept zero or muliple arguments. Before varargs either we use overloaded method or take an array as the method parameter but it was not considered good because it leads to the maintenance problem.
 * If we don't know how many argument we will have to pass in the method, varargs is the better approach.
 */
public class VariableArgument {

    static void display(String... values) {
        System.out.println("display method invoked ");
        for (String s : values) {
            System.out.println(s);
        }
    }

    static void display1(int num, String... values) {
        System.out.println("number is " + num);
        for (String s : values) {
            System.out.println(s);
        }
    }

    public static void main(String args[]) {

        // Autoboxing and Unboxing with comparison operators
        Integer i = new Integer(50);  //boxing
        Integer j = 5;               //unboxing internally

        display();//zero argument
        display("hello");//one argument
        display("my", "name", "is", "varargs");//four arguments

        System.out.println();
        System.out.println("Example of Varargs that is the last argument in the method:");
        display1(500, "hello");//one argument
        display1(1000, "my", "name", "is", "varargs");//four arguments
    }
}
