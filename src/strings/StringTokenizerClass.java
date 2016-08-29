package strings;

import java.util.StringTokenizer;

/**
 * Created by mrahbari on 06/06/2015.
 * <p>
 * The java.util.StringTokenizer class allows you to break a string into tokens. It is simple way to break string.
 * <p>
 * Public methods:
 * boolean hasMoreTokens()	        checks if there is more tokens available.
 * String nextToken()	            returns the next token from the StringTokenizer object.
 * String nextToken(String delim)	returns the next token based on the delimiter.
 * boolean hasMoreElements()	    same as hasMoreTokens() method.
 * Object nextElement()	            same as nextToken() but its return type is Object.
 * int countTokens()	            returns the total number of tokens.
 */
public class StringTokenizerClass {

    public static void main(String args[]) {

        StringTokenizer st = new StringTokenizer("my name is khan", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // printing next token
        System.out.println("\n\n\n");
        StringTokenizer st2 = new StringTokenizer("my,name,is,khan");
        //System.out.println(st2);                //java.util.StringTokenizer@4554617c
        while(st2.hasMoreTokens())
            System.out.println(st2.nextToken(","));

        System.out.println("\n\n\n");
        StringTokenizer st3 = new StringTokenizer("my,name,is,khan");
        System.out.println("Next token is : " + st3.nextToken(","));    //Next token is : my
        System.out.println(st3.countTokens());  //3
        System.out.println(st3.nextElement());  //name
        System.out.println(st3.nextElement());  //is*/
    }
}
