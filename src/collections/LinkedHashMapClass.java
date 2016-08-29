package collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by mrahbari on 06/02/2015.
 *
 * A HashMap contains values based on the key. It implements the Map interface and extends AbstractMap class.
 * It contains only unique elements.
 * It may have one null key and multiple null values.
 * It maintains no order.
 *
 * Methods of Entry interface:
 *      1.public Object getKey(): is used to obtain key.
 *      2.public Object getValue():is used to obtain value.
 *
 * What is difference between HashSet and HashMap?
 *  HashSet contains only values whereas HashMap contains entry(key and value).
 */
public class LinkedHashMapClass {

    public static void main(String argv[]) {

        LinkedHashMap<Integer, String> list = new LinkedHashMap<Integer, String>();
        list.put(1, "Mojtaba");
        list.put(2, "Rahbri");

        for (Map.Entry m : list.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
