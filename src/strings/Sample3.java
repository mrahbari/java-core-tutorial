package strings;

/**
 * Created by mrahbari on 06/06/2015.
 */
public class Sample3 {
    public static void main(String argv[]){

        // Immutable String in Java
        String s="Sachin";
        s= "Reza" + " " + "Ali" + " " + s;
        s += s;
        s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s);//will print Sachin because strings are immutable objects


        // Java String compare
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false


        //equals Ignore Case
        String s01="Sachin";
        String s02="SACHIN";
        System.out.println(s01.equals(s02));//false
        System.out.println(s01.equalsIgnoreCase(s02));//true

        // String compare by == operator
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)


        // String compare by compareTo() method
        // s001 == s002     :0
        // s001 > s002      :positive value
        // s001 < s002      :negative value
        String s001="Sachin";
        String s002="Sachin";
        String s003="Ratan";
        System.out.println(s001.compareTo(s002));//0
        System.out.println(s001.compareTo(s003));//1(because s001>s003)
        System.out.println(s003.compareTo(s001));//-1(because s003 < s001 )

    }
}
