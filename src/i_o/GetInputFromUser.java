package i_o;

import java.io.*;
import java.util.Scanner;

/**
 * Created by mrahbari on 06/08/2015.
 */
public class GetInputFromUser {

    public static void main(String argv[]) {
        int a;
        float b;
        String s;

        /*// input user with scanner class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        s = in.nextLine();
        System.out.println("You entered string " + s);

        try {
            System.out.println("Enter an integer");
            a = in.nextInt();
            System.out.println("You entered integer " + a);
        }catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Enter a float");
        b = in.nextFloat();
        System.out.println("You entered float " + b);*/


        // Java Scanner Example to get input from console
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your rollno");
            int rollno = sc.nextInt();
            System.out.println("Enter your name");
            String name = sc.next();
            System.out.println("Enter your fee");
            double fee = sc.nextDouble();
            System.out.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Java Scanner Example with delimiter
        String input = "10 tea 20 coffee 30 tea buiscuits";
        Scanner s01 = new Scanner(input).useDelimiter("\\s");
        System.out.println(s01.nextInt());
        System.out.println(s01.next());
        System.out.println(s01.nextInt());
        System.out.println(s01.next());
        s01.close();

        /*// Java Console Example to read password
        try {

            String text=System.console().readLine();
            System.out.println("Text is: "+text);

            Console c = System.console();
            System.out.println("Enter password: ");
            char[] ch = c.readPassword();
            String pass = String.valueOf(ch);//converting char array into string
            System.out.println("Password is: " + pass);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
    }
}
