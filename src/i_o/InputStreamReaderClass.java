package i_o;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mrahbari on 06/08/2015.
 */
public class InputStreamReaderClass {

    public static void main(String argv[]){

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Input your text");
        try {
            String s = br.readLine();
            System.out.println(s);

            br.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
