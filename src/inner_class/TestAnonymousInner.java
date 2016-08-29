package inner_class;

abstract class Person{
    abstract void eat();
}

/**
 * Created by mrahbari on 06/07/2015.
 */
public class TestAnonymousInner {

    public static void main(String argv[]){
        Person p = new Person() {
            @Override
            void eat() {
                System.out.println("Welcome to Anonymous Inner Class");
            }
        };
        p.eat();
    }

}
