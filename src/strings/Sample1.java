package strings;

/**
 * Created by mrahbari on 06/06/2015.
 * Generally, string is a sequence of characters. But in java, string is an object that represents a sequence of characters.
 * String class is used to create string object.
 */
public class Sample1 {
    public static void main(String argv[]) {

        // An array of characters works same as java string. For example:
        char[] s = {'M', 'O', 'J', 'I', 'T', 'O'};
        System.out.println(s);

        // convert to string
        String s1 = new String(s);
        System.out.println(s1);

        // string literal
        String s2 = "Mojtaba Rahbari";
        System.out.println(s2);

        // creates two objects and one reference variable
        String s3=new String("example");//creating java string by new keyword
        String s03=new String("example");//creating java string by new keyword
        System.out.println(s3 + s03);

        // returns char value for the particular index
        System.out.println(s3.charAt(3));

        // returns string length
        System.out.println(s3.length());

        // returns formatted string
        float num = (float) 1666.343444;
        System.out.printf("%-12.5f", num);
    }
}
