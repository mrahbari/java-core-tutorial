package collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by mrahbari on 06/02/2015.
 *
 * uses hashtable to store the elements.It extends AbstractSet class and implements Set interface.
 * contains unique elements only.
 */

public class LinkedHashSetClass {

        public static void main(String argv[]){
            HashSet<String> arrayHashList= new HashSet<String>();
            arrayHashList.add("apple");
            arrayHashList.add("apple");
            arrayHashList.add("banana");
            arrayHashList.add("banana");
            arrayHashList.add("orange");
            arrayHashList.add("orange");
            arrayHashList.add("orange");
            arrayHashList.add("mango");

            //arrayHashList.remove("mango");



            // Getting Iterator from arrayHashList to traverse elements
            System.out.println("\n\n" + "Sample of hashed list Iterator with for each loop:".toUpperCase());
            arrayHashList.forEach(System.out::println);

            // Getting Iterator from arrayHashList to traverse elements
            System.out.println("\n\n" + "Sample of hashed list Iterator with for each loop:".toUpperCase());
            for(String obj:arrayHashList)
                System.out.println(obj);

            System.out.println("\n\n" + "Sample of hashed list Iterator with while loop:".toUpperCase());
            Iterator<String> itr = arrayHashList.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
