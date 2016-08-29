package i_o;

import java.io.*;

/**
 * Created by mrahbari on 06/07/2015.
 */
public class Sample {

    public static void main(String argv[]) throws IOException {

        /*// raise error
        System.err.println("Error was raised!");

        // input number
        int numb = System.in.read();
        System.out.printf("%d \n" , numb);
        System.out.println((char)numb);*/

        // create and write to file
        FileOutputStream file = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\abc.md");
        String s= "Welcome to IO section";
        byte bt[] = s.getBytes();
        file.write(bt);
        file.close();
    }
}
