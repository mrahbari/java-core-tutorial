package collections;

import java.util.TreeMap;
import java.util.Map;

/**
 * Created by mrahbari on 06/02/2015.
 *
 * A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 * It contains only unique elements.
 * It cannot have null key but can have multiple null values.
 * It is same as HashMap instead maintains ascending order.
 */
public class TreeMapClass {

    public static void main(String argv[]) {

        TreeMap<Integer, String> list = new TreeMap<>();
        list.put(1, "Mojtaba");
        list.put(2, "Rahbri");

        for (Map.Entry m : list.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
