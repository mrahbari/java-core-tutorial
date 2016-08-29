package generics;

import java.util.*;

/**
 * Created by mrahbari on 05/30/2015.
 */
public class Generics {

    public static void main(String argv[]) {

        // lists without using generics
        List list = new ArrayList();
        list.add("hello");
        list.add("welcome");
        list.add("to your system");
        System.out.print(list.get(0));
        System.out.print(list.size());

        // for assignment, type casting is needed. (because of not using generics)
        String s = (String) list.get(0);

        ////////////////////////////////////
        // now, it;s time to use generics
        // After Generics, we don't need to typecast the object.
        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        list2.add("welcome");
        list2.add("to your system");
        //list2.add(32);//compile time error
        System.out.print(list2.get(0));

        // for assignment, type casting is needed. (because of not using generics)
        String s2 = list2.get(0);
        System.out.print(s2);


        System.out.println("\n\n");
        Iterator<String> itr = list2.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        ////////////////////////////////////
        ///Example of Java Generics using Map
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "map generic1");
        map.put(2, "map generic2");
        map.put(3, "map generic3");

        //Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr2 = set.iterator();
        while (itr2.hasNext()) {
            Map.Entry e = itr2.next();//no need to typecast
            System.out.println(e.getKey() + " " + e.getValue());
        }


    }
}
