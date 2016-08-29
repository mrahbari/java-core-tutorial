package collections;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by mrahbari on 07/01/2015.
 * <p>
 * +Vector()
 * +Vector(c: Collection<? extends E>)
 * +Vector(initialCapacity: int)
 * +Vector(initCapacity: int, capacityIncr: int)
 * +addElement(o: E): void
 * +capacity(): int
 * +copyInto(anArray: Object[]): void
 * +elementAt(index: int): E
 * +elements(): Enumeration<E>
 * +ensureCapacity(): void
 * +firstElement(): E
 * +insertElementAt(o: E, index: int): void
 * +lastElement(): E
 * +removeAllElements(): void
 * +removeElement(o: Object): boolean
 * +removeElementAt(index: int): void
 * +setElementAt(o: E, index: int): void
 * +setSize(newSize: int): void
 * +trimToSize(): void
 */
public class VectorClass {

    public static void main(String argv[]) {

        Vector<String> vec = new Vector<String>();

        vec.add("mojtaba");
        vec.add("reza");
        vec.add("mona");

        // elementAt
        System.out.println(vec.elementAt(1) + "\n\n");

        // foreach
        for (Object aVec : vec) {
            System.out.println(aVec);
        }
        System.out.println("\n");

        // Getting Iterator from arrayLinkedList to traverse elements
        Iterator<String> itr = vec.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("\n");



        // REVIEW

    }


}
