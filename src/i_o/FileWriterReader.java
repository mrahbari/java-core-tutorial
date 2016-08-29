package i_o;

import java.io.*;

/**
 * Created by mrahbari on 06/08/2015.
 *
 * Java FileWriter and FileReader classes are used to write and read data from text files. These are character-oriented classes, used for file handling in java.
 * Java has suggested not to use the FileInputStream and FileOutputStream classes if you have to read and write the textual information.
 */
public class FileWriterReader {

    public static void main(String argv[]) {

        try {
            FileReader fr = new FileReader("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\file-reader.md");
            FileWriter fw = new FileWriter("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\file-writer.md");

            int i = 0;
            while ((i = fr.read()) != -1) {
                fw.write((char) i);
            }

            // because of fileWriter we can write characters in file directly.
            fw.append("this is a test for append data in text file");
            fr.close();
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
