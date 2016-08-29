package inner_class;

interface Showable{
    void show();
    interface Message{
        void msg(String data);
    }
}
/**
 * Created by mrahbari on 06/07/2015.
 */
public class TestNestedInterface1 implements Showable.Message{
    @Override
    public void msg(String data) {
        System.out.println(data);
    }

    public static void main(String argv[]){
        Showable.Message obj = new TestNestedInterface1();
        obj.msg("Hello World");
    }
}
