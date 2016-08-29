package inner_class;

interface Eatable{
    void eat();
}
/**
 * Created by mrahbari on 06/07/2015.
 */
public class TestAnonymousInner1 {

    public static void main(String argv[]){
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("Eatable via Anonymous Inner!");
            }
        };
        e.eat();
    }
}
