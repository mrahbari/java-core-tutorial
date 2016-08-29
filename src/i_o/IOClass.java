package i_o;

import java.io.*;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by mrahbari on 06/07/2015.
 */
public class IOClass {

    public static void main(String argv[]) throws IOException {

        /*
        // input & read file
        try {
            FileInputStream fileIn = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\input.md");
            int i = 0;
            while ((i = fileIn.read()) != -1) {
                System.out.print((char) i);
            }
            fileIn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // create and write to file
        try {
            FileOutputStream fileOut = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write.md");
            String s = "Welcome to IO section";
            byte bt[] = s.getBytes();
            fileOut.write(bt);
            fileOut.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // example of Reading the data of current command line and writing it into another file
        try {
            FileOutputStream fileOut3 = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write3.md");
            Scanner in = new Scanner(System.in);
            String s;
            System.out.println("Please insert a string to write to file:");
            s = in.nextLine();
            byte b[] = s.getBytes();
            fileOut3.write(b);
            fileOut3.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Java ByteArrayOutputStream Example
        // Java ByteArrayOutputStream class is used to write data into multiple files. In this stream, the data is written into a byte array that can be written to multiple stream.
        // Let's see a simple example of java ByteArrayOutputStream class to write data into 2 files.
        try {
            FileOutputStream fileOut4 = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write4.md");
            FileOutputStream fileOut5 = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write5.md");
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            bout.write(150);
            bout.writeTo(fileOut4);
            bout.writeTo(fileOut5);
            fileOut4.close();
            fileOut5.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Simple example of SequenceInputStream class
        // Java SequenceInputStream class is used to read data from multiple streams. It reads data of streams one by one.
        try {
            FileInputStream file6 = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write.md");
            FileInputStream file7 = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write2.md");
            SequenceInputStream sq = new SequenceInputStream(file6, file7);

            int i = 0;
            while ((i = sq.read()) != -1) {
                System.out.print((char) i);
            }
            file6.close();
            file7.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        // Example of SequenceInputStream class that reads the data from multiple files using enumeration
        // If we need to read the data from more than two files, we need to have these information in the Enumeration object.
        // Enumeration object can be get by calling elements method of the Vector class.
        // Let's see the simple example where we are reading the data from the 4 files.
        try {
            //creating the FileInputStream objects for all the files
            FileInputStream file8 = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write.md");
            FileInputStream file9 = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write2.md");
            FileInputStream file10 = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write3.md");

            //creating Vector object to all the stream
            Vector vc = new Vector();
            vc.add(file8);
            vc.add(file9);
            vc.add(file10);

            //creating enumeration object by calling the elements method
            Enumeration e = vc.elements();

            //passing the enumeration object in the constructor
            SequenceInputStream sq2 = new SequenceInputStream(e);
            int i = 0;
            while ((i = sq2.read()) != -1) {
                System.out.print((char) i);
            }
            file8.close();
            file9.close();
            file10.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Java BufferedOutputStream class
        // Java BufferedOutputStream class uses an internal buffer to store data. It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.
        try {
            FileOutputStream fileOut11 = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write6.md");
            BufferedOutputStream bufferOut = new BufferedOutputStream(fileOut11);

            String s = "Welcome to IO section via Buffered Output Stream";
            byte bt[] = s.getBytes();
            bufferOut.write(bt);
            bufferOut.flush();
            bufferOut.close();
            fileOut11.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/


        // Example of Java BufferedInputStream
        // Let's see the simple example to read data of file using BufferedInputStream.
        try {
            FileInputStream fileIn4 = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\input.md");
            BufferedInputStream bufferIn = new BufferedInputStream(fileIn4);
            int i = 0;
            while ((i = bufferIn.read()) != -1) {
                System.out.print((char) i);
            }
            bufferIn.close();
            fileIn4.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
