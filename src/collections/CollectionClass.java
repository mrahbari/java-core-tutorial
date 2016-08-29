package collections;

import java.util.*;

/**
 * Created by mrahbari on 07/01/2015.
 * <p>
 * +ArrayList()
 * +ArrayList(c: Collection<? extends E>)
 * +ArrayList(initialCapacity: int)
 * +trimToSize(): void
 * java.util.AbstractList<E>
 */
public class CollectionClass {
    public static void main(String argv[]) {

        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("reza");
        collection1.add("mona");

        for (String aCollection1 : collection1)
            System.out.print(aCollection1 + " ");

        System.out.println();

        Iterator<String> it = collection1.iterator();
        while (it.hasNext())
            System.out.print(it.next() + " ");


        ArrayList<String> c1 = (ArrayList<String>) (collection1.clone());
        System.out.println("\nCities in collection1 or collection2: ");
        System.out.println(c1);


        Collection<String> collection = new ArrayList<String>();
        collection.add("New York");
        collection.add("Atlanta");
        collection.add("Dallas");
        collection.add("Madison");
        System.out.println(collection);

        System.out.println("\n\n");
        collection.stream().forEach((elm) -> {
            System.out.println("Content: " + elm);
        });
        System.out.println("\n\n");

        Iterator<String> itr = collection.iterator();
        while (itr.hasNext())
            System.out.print(itr.next().toUpperCase() + " ");


        Collection<String> collection2 = Arrays.asList("red", "green", "blue");
        System.out.println(Collections.max(collection2));
        System.out.println(Collections.min(collection2));

        Collection<String> collection5 = Arrays.asList("red", "cyan");
        Collection<String> collection6 = Arrays.asList("red", "blue");
        System.out.println(Collections.disjoint(collection5, collection6));
    }
}