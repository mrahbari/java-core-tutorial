package generics;

import java.util.Iterator;

/**
 * Created by mrahbari on 06/01/2015.
 */
public class TestGenericsClass {

    public static void main(String argv[]){
        GenericsClass<Integer> m = new GenericsClass<Integer>();
        m.add(2);
        m.add(98);
        m.add(12);
        m.add(3);
        m.add(4);

        System.out.println(m.get());
    }
}
