package inner_class;

/**
 * Created by mrahbari on 06/04/2015.
 */
public class MemberInnerClass {
    Integer data = 30;

    class Inner{
        void msg(){
            System.out.println("Welcome to inner class with no:" + data);
        }
    }

    public static void main(String argv[]){
        MemberInnerClass obj = new MemberInnerClass();
        MemberInnerClass.Inner innerObj = obj.new Inner();  // note for creating new object
        innerObj.msg();
    }

}
