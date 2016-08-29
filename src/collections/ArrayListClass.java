package collections;

import java.util.*;

/**
 * Created by mrahbari on 06/02/2015.
 * Collection framework represents a unified architecture for storing and manipulating group of objects.
 *
 *  +ArrayList()
 * +ArrayList(c: Collection<? extends E>)
 * +ArrayList(initialCapacity: int)
 * +trimToSize(): void
 * java.util.AbstractList<E>
 */
public class ArrayListClass {

    public static void main(String argv[]) {

        String fruits[] = {"banana1", "orange1", "appale1"};
        int i;
        int j;
        for (i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]);
        }

        // Demonstrate a two-dimensional array.
        int x = 10; //some value
        int y = 12; //some other value
        String[][] arr = new String[x][y];

        for (i = 0; i < x; i++) {
            for (j = 0; j < y; j++) {
                arr[i][j] = String.valueOf(i*j);    // Convert integer to string [duplicate]
                System.out.print(arr[i][j] + " ");

            }
        }


        ///////////////////////////////////////////////////////
        ArrayList<String> arrayList = new ArrayList<>();  //new ArrayList<String>();
        arrayList.add("banana");
        arrayList.add("orange");
        arrayList.add("apple");

        // Sorting
        Collections.sort(arrayList);
        Collections.swap(arrayList, 0, 2);

        // Getting Iterator from arraylist to traverse elements
        System.out.println("\n\n" + "Sample of Iterator- while:".toUpperCase());
        Iterator<String> itr = arrayList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterating the elements of Collection by for-each loop
        System.out.println("\n\n" + "Sample of Iterator- for-each loop:".toUpperCase());
        arrayList.forEach(System.out::println);
        /*for (String obj : arrayList)
            System.out.println(obj);*/

        /////////////////////////////////////////////////
        System.out.println("\n\n" + "Sample of addAll:".toUpperCase());
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("mooz");
        arrayList1.add("sib");
        arrayList1.add("khiar");

        // Example of addAll(Collection c) method
        arrayList.addAll(arrayList1);

        // Example of removeAll() method
        // arrayList.removeAll(arrayList1);

        Iterator itr2 = arrayList.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        /*if (itr2.hasNext()) {
            do {
                System.out.println(itr2.next());
            } while (itr2.hasNext());
        }
        while (true) {
            if (!(itr2.hasNext())) break;
            System.out.println(itr2.next());
        }*/


        ////////////////////////////////////////////////////////////
        // Example of retainAll() method
        System.out.println("\n\n" + "Sample of retain:".toUpperCase());
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("banana");

        // Example of retainAll() method
        arrayList.retainAll(arrayList2);

        for (Object anArrayList : arrayList) {
            System.out.println(anArrayList);
        }

        Iterator itr3 = arrayList.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
    }
}
