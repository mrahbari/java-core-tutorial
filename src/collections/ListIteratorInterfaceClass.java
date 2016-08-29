package collections;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by mrahbari on 06/02/2015.
 *
 * Commonly used methods of List Interface:
    public void add(int index,Object element);
    public boolean addAll(int index,Collection c);
    public object get(int Index position);
    public object set(int index,Object element);
    public object remove(int index);
    public ListIterator listIterator();
    public ListIterator listIterator(int i);

 Commonly used methods of ListIterator Interface:
    public boolean hasNext();
    public Object next();
    public boolean hasPrevious();
    public Object previous();
 */
public class ListIteratorInterfaceClass {

    public static void main(String args[]){

        ArrayList<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");
        try {
            al.set(0,"mojtaba");
        }catch(IndexOutOfBoundsException e){
            System.out.println(e + "\n");
        }

        System.out.println("element at 2nd position: "+al.get(2));


        System.out.println("\ntraversing elements in forward direction...".toUpperCase());
        ListIterator<String> itr=al.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        System.out.println("\ntraversing elements in backward direction...".toUpperCase());
        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}