package generics;

/**
 * Created by mrahbari on 06/01/2015.
 */
public class TestGenericMethod {

    public static <E> void printArray(E[] inputArray) {
        // display array elements

        for (E element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();

    }

    public static void main(String argv[]) {
        //create array of Integer, Double and Character
        Integer[] intArray = {2, 4, 5, 6, 8};
        Double[] doubleArray = {4.5, 6.1, 4.2};
        Character[] charArray = {'F', 'T', 'W', 'Q'};

        System.out.println("Array integerArray contains:");
        printArray(intArray); // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray); // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray); // pass a Character array
    }
}
