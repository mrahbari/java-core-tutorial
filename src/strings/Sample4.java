package strings;

/**
 * Created by mrahbari on 06/06/2015.
 */
public class Sample4 {
    public static void main(String argv[]){

        String s="Sachin"+" Tendulkar";
        System.out.println(s);//Sachin Tendulkar


        //String Concatenation by append and toString method
        String s2=(new StringBuilder()).append("Sachin").append(" Tendulkar").toString();
        String s3=(new StringBuffer()).append("Sachin").append(" Tendulkar").toString();
        System.out.println(s2);
        System.out.println(s3);

        // String Concatenation by concat() method
        String s01="Sachin ";
        String s02="Tendulkar";
        String s03=s01.concat(s02);
        System.out.println(s03);//Sachin Tendulkar


        // substring in java
        System.out.println(s02.substring(2));
        System.out.println(s02.substring(2,5));

        try {
            System.out.println(s02.substring(2, -1));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        // When the intern method is invoked, if the pool already contains a string equal to this String object as determined by the equals(Object) method, then the string from the pool is returned.
        // Otherwise, this String object is added to the pool and a reference to this String object is returned.
        String x=new String("Sachin");
        String x2=x.intern();
        System.out.println(x2);//Sachin

        // The string valueOf() method coverts given type such as int, long, float, double, boolean, char and char array into string.
        Integer a= 10;
        String b = String.valueOf(a);
        System.out.println(b + a);  //1010
        System.out.println(10 + a);  //20

        String aa="Java is a programming language. Java is a platform. Java is an Island.";
        String bb = aa.replace("Java", "Kava");
        System.out.println(aa);     // Java is a programming language. Java is a platform. Java is an Island.
        System.out.println(bb);     // Kava is a programming language. Kava is a platform. Kava is an Island.

    }
}
