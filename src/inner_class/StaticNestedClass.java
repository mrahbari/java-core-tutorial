package inner_class;

/**
 * Created by mrahbari on 06/07/2015.
 */
public class StaticNestedClass {

    public static int data =10;

    static class Inner{
        static void msg(){
            System.out.println("Number value is: "+ data);
        }
    }

    public static void main(String argv[]){
        StaticNestedClass.Inner st = new StaticNestedClass.Inner();
        st.msg();

        // OR

        StaticNestedClass.Inner.msg();
    }

}
