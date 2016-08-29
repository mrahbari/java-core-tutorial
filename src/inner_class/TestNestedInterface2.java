package inner_class;

class A{
    interface Message{
        void msg();
    }
}

/**
 * Created by mrahbari on 06/07/2015.
 */
public class TestNestedInterface2 implements A.Message {

    public void msg(){
        System.out.println("Hello world Test Nested Interface 2");
    }

    public static void main(String argv[]){

        A.Message ms = new TestNestedInterface2();
        ms.msg();

        // OR
        TestNestedInterface2 ms2 = new TestNestedInterface2();
        ms2.msg();
    }

}
