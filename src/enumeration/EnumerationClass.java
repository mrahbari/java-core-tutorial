package enumeration;

/**
 * Created by mrahbari on 06/13/2015.
 */
public class EnumerationClass {

    public enum Season { WINTER, SPRING, SUMMER, FALL }

    public static void main(String argv[]){

        for (Season s : Season.values()){
            System.out.print(s + " ");
        }

        // just one element
        System.out.println("\n" + Season.SUMMER);

        // list via foreach
        for (Season s2: Season.values())
            System.out.println(s2);
    }

}
