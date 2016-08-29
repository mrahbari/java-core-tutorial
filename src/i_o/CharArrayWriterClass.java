package i_o;

import java.io.*;

/**
 * Created by mrahbari on 06/08/2015.
 *
 * Java FileWriter and FileReader classes are used to write and read data from text files. These are character-oriented classes, used for file handling in java.
 * Java has suggested not to use the FileInputStream and FileOutputStream classes if you have to read and write the textual information.
 */
public class CharArrayWriterClass {

    public static void main(String argv[]) {

        try {
            CharArrayWriter ca = new CharArrayWriter();
            ca.write("this is gangem style");

            FileWriter fw = new FileWriter("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\file-char-array-writer.md");

            ca.writeTo(fw);
            ca.flush();
            ca.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
