package collections;

import java.util.PriorityQueue;
import java.util.Iterator;

/**
 * Created by mrahbari on 06/02/2015.
 *
 * The PriorityQueue class provides the facility of using queue. But it does not orders the elements in FIFO manner.
 *
 * Methods of Queue Interface :
    public boolean add(object);
    public boolean offer(object);
    public remove();
    public poll();
    public element();
    public peek();
 */

public class PriorityQueueClass {

        public static void main(String argv[]){
            PriorityQueue<String> arrayPQList= new PriorityQueue<String>();
            arrayPQList.add("apple");
            arrayPQList.add("apple");
            arrayPQList.add("banana");
            arrayPQList.add("banana");
            arrayPQList.add("orange");
            arrayPQList.add("orange");
            arrayPQList.add("orange");
            arrayPQList.add("mango");


            System.out.println("head || element:"+arrayPQList.element());
            System.out.println("\n\n" + "element with for each loop:".toUpperCase());
            for(String obj:arrayPQList)
                System.out.println(obj);

            System.out.println("peek:"+arrayPQList.peek());
            System.out.println("\n\n" + "peek with for each loop:".toUpperCase());
            for(String obj:arrayPQList)
                System.out.println(obj);

            System.out.println("remove:"+arrayPQList.remove());
            System.out.println("\n\n" + "remove with for each loop:".toUpperCase());
            for(String obj:arrayPQList)
                System.out.println(obj);

            System.out.println("poll:"+arrayPQList.poll());
            System.out.println("\n\n" + "pool with for each loop:".toUpperCase());
            for(String obj:arrayPQList)
                System.out.println(obj);

            // Getting Iterator from arrayPQList to traverse elements
            System.out.println("\n\n" + "Sample of priority list Iterator with for each loop:".toUpperCase());
            for(String obj:arrayPQList)
                System.out.println(obj);

            System.out.println("\n\n" + "Sample of priority list Iterator with while loop:".toUpperCase());
            Iterator<String> itr = arrayPQList.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }
