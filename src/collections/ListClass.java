package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mrahbari on 07/01/2015.
 *
 * +sort(list: List): void
 * +sort(list: List, c: Comparator): void
 * +binarySearch(list: List, key: Object): int
 * +binarySearch(list: List, key: Object, c: Comparator): int
 * +reverse(list: List): void
 * +reverseOrder(): Comparator
 * +shuffle(list: List): void
 * +shuffle(list: List, rmd: Random): void
 * +copy(des: List, src: List): void
 * +nCopies(n: int, o: Object): List
 * +fill(list: List, o: Object): void                       : Fills the list with the object.
 * +max(c: Collection): Object
 * +max(c: Collection, c: Comparator): Object
 * +min(c: Collection): Object
 * +min(c: Collection, c: Comparator): Object
 * +disjoint(c1: Collection, c2: Collection): boolean       : Returns true if c1 and c2 have no elements in common.
 * +frequency(c: Collection, o: Object): int                : Returns the number of occurrences of the specified element in the collection.
 */
public class ListClass {

    public static void main(String argv[]) {
        List<String> list = Arrays.asList("red", "green", "blue");
        Collections.sort(list);
        System.out.println(list + "\n\n");

        List<String> list2 = Arrays.asList("yellow", "red", "green", "blue");
        Collections.reverse(list2);
        System.out.println(list2 + "\n\n");

        List<String> list3 = Arrays.asList("yellow", "red", "green", "blue", "mojtaba", "brown", "gold");
        Collections.shuffle(list3);
        System.out.println(list3 + "\n\n");
        Collections.swap(list3, 2, 4);
        System.out.println(list3 + "\n\n");

        List<String> list4 = Arrays.asList("yellow", "red", "green", "blue");
        List<String> list5 = Arrays.asList("white", "black");
        Collections.copy(list4, list5);
        System.out.println(list5);



    }
}
