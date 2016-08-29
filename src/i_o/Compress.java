package i_o;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * Created by mrahbari on 06/08/2015.
 * The DeflaterOutputStream and InflaterInputStream classes provide mechanism to compress and uncompress the data in the deflate compression format.
 */
public class Compress {
    public static void main(String args[]) {

        try {
            FileInputStream fin = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\input.md");
            FileOutputStream fout = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write2.md");
            DeflaterOutputStream out = new DeflaterOutputStream(fout);

            int i;
            while ((i = fin.read()) != -1) {
                out.write((byte) i);
                out.flush();
            }

            fin.close();
            out.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");

        try {
            FileInputStream fin = new FileInputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\input.md");
            InflaterInputStream in = new InflaterInputStream(fin);
            FileOutputStream fout = new FileOutputStream("D:\\Java\\Pluralsight.Java.Fundamentals\\src\\i_o\\files\\write2.md");

            int i;
            while ((i = in.read()) != -1) {
                fout.write((byte) i);
                fout.flush();
            }

            fin.close();
            fout.close();
            in.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

}
