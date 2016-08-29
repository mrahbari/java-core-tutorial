package collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by mrahbari on 06/02/2015.
 */
public class LinkedListClass {

    public static void main(String argv[]){
        LinkedList<String> arrayLinkedList = new LinkedList<String>();
        arrayLinkedList.add("apple");
        arrayLinkedList.add("banana");
        arrayLinkedList.add("orange");

        // Getting Iterator from arrayLinkedList to traverse elements
        System.out.println("\n\n" + "Sample of Linked list Iterator:".toUpperCase());
        arrayLinkedList.forEach(System.out::println);

        // Getting Iterator from arrayLinkedList to traverse elements
        System.out.println("\n\n" + "Sample of Linked list Iterator:".toUpperCase());
        for (String anArrayLinkedList : arrayLinkedList) {
            System.out.println(anArrayLinkedList);
        }

        // Getting Iterator from arrayLinkedList to traverse elements
        Iterator<String> itr = arrayLinkedList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
