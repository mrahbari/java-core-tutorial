package collections;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by mrahbari on 06/02/2015.
 * <p>
 * contains unique elements only like TreeSet.
 * The TreeSet class implements NavigableSet interface that extends the SortedSet interface.
 * maintains ascending order.
 * UNIQUE, SORT ASC
 */
public class TreeSetClass {

    public static void main(String argv[]) {
        TreeSet<String> arrayTreeSetList = new TreeSet<>();
        arrayTreeSetList.add("apple");
        arrayTreeSetList.add("apple");
        arrayTreeSetList.add("banana");
        arrayTreeSetList.add("banana");
        arrayTreeSetList.add("orange");
        arrayTreeSetList.add("orange");
        arrayTreeSetList.add("orange");

        // Getting Iterator from arrayTreeSetList to traverse elements
        System.out.println("\n\n" + "Sample of tree set list Iterator with for each loop:".toUpperCase());
        for (String obj : arrayTreeSetList)
            System.out.println(obj);

        System.out.println("\n\n" + "Sample of tree set list Iterator with while loop:".toUpperCase());
        Iterator<String> itr = arrayTreeSetList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
