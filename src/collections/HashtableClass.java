package collections;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by mrahbari on 06/02/2015.
 *
 * A Hashtable is an array of list.Each list is known as a bucket.The position of bucket is identified by calling the hashcode() method.A Hashtable contains values based on the key. It implements the Map interface and extends Dictionary class.
 *  It contains only unique elements.
 *  It may have not have any null key or value.
 *  It is synchronized.
 */
public class HashtableClass {

    public static void main(String argv[]) {

        Hashtable<Integer, String> list = new Hashtable<Integer, String>();
        list.put(1, "Mojtaba");
        list.put(2, "Rahbri");

        for (Map.Entry m : list.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
