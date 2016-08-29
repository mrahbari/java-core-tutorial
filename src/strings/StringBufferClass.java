package strings;

/**
 * Created by mrahbari on 06/06/2015.
 * <p>
 * Java StringBuffer class is used to created mutable (modifiable) string. The StringBuffer class in java is same as String class except it is mutable i.e. it can be changed.
 */
public class StringBufferClass {

    public static void main(String argv[]) {

        String s = "Welcome to my country";
        // s.reverse(); it's immutable and you cant modify it.

        StringBuffer s1 = new StringBuffer("Welcome");  //Welcome
        s1.append(" To");                               //Welcome To
        s1.insert(2, " Your Country");                  //We Your Countrylcome To
        System.out.println(s1);

        s1.replace(2,6,"");                             //Wer Countrylcome To
        s1.replace(2,4,"KAVA");                         //Wer Countrylcome To
        System.out.println(s1);                         //WeKAVACountrylcome To

        // The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
        s1.delete(1,3);
        System.out.println(s1);                         //WAVACountrylcome To

        // The reverse() method of StringBuilder class reverses the current string.
        s1.reverse();
        System.out.println(s1);                         //oT emoclyrtnuoCAVAW


        // StringBuffer capacity() method
        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb.append(" and spring framework"); //now (34*2)+2=70 i.e (oldcapacity*2)+2
        System.out.println(sb.capacity());


        //The ensureCapacity() method of StringBuffer class ensures that the given capacity is the minimum to the current capacity.
        // If it is greater than the current capacity, it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
        StringBuffer sb1=new StringBuffer();
        System.out.println(sb.capacity());//default 16
        sb1.append("Hello");
        System.out.println(sb1.capacity());//now 16
        sb1.append("java is my favourite language");
        System.out.println(sb1.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb1.ensureCapacity(10);//now no change
        System.out.println(sb1.capacity());//now 34
        sb1.ensureCapacity(50);//now (34*2)+2
        System.out.println(sb1.capacity());//now 70
    }
}
