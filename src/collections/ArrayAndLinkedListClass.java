package collections;

/**
 * Created by mrahbari on 07/01/2015.
 *
 * +ArrayList()
 * +ArrayList(c: Collection<? extends E>)
 * +ArrayList(initialCapacity: int)
 * +trimToSize(): void
 * java.util.AbstractList<E>
 *
 *
 * +LinkedList()
 * +LinkedList(c: Collection<? extends E>)
 * +addFirst(o: E): void
 * +addLast(o: E): void
 * +getFirst(): E
 * +getLast(): E
 * +removeFirst(): E
 * +removeLast(): E
 */

import java.util.*;

public class ArrayAndLinkedListClass {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1); // 1 is autoboxed to new Integer(1)
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0, 10);
        arrayList.add(3, 30);   // it'll be added not overwrite

        System.out.println("A list of integers in the array list:");
        System.out.println(arrayList);
        System.out.println("-------------------------------");



        LinkedList<Object> linkedList = new LinkedList<Object>(arrayList);
        linkedList.add(1, "red");
        //linkedList.removeLast();
        linkedList.addFirst("green");

        System.out.println("Display the linked list forward:");
        ListIterator<Object> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println("-------------------------------");
        System.out.println();


        System.out.println("Display the linked list backward:");
        listIterator = linkedList.listIterator(linkedList.size());
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }

        // OR
        System.out.println();
        for (Object aLinkedList : linkedList)
            System.out.print(aLinkedList + " ");


        // OR
        System.out.println();
        for (int j=0; j <linkedList.size(); j++)
            System.out.print(linkedList.get(j) + " ");

        System.out.println();
        Iterator<Object> itr2 = linkedList.iterator();
        while(itr2.hasNext())
            System.out.print(itr2.next() + " ");
    }
}