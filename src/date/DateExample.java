package date;

import java.util.Date;
//import java.sql.Date;
import java.util.*;
import java.text.*;
//import java.util.Date;
/**
 * Created by mrahbari on 06/08/2015.
 */
public class DateExample {

    public static void main(String arg[]) {


        Jalali jCal = new Jalali(); // Make an instance
        jCal.persianToGregorian(1392, 10, 19); // Convert the date
        System.out.println(jCal.toString()); // Print it!

        jCal.gregorianToPersian(2015, 6, 9); // Convert the date
        /*System.out.println(jCal.toString());
        System.out.println(jCal.getYear());
        System.out.println(jCal.getMonth());
        System.out.println(jCal.getDay());*/

        java.util.Date currentDate = new java.util.Date();
        System.out.println("Current Date: " + currentDate);

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            java.util.Date date = formatter.parse("31/03/2015");
            System.out.println("Date is: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }


        /*long millis = System.currentTimeMillis();
        java.sql.Date dt01= new java.sql.Date(millis);
        System.out.println(dt01);


        String str="2015-03-31";
        Date date=Date.valueOf(str);//converting string into sql date
        System.out.println(date);*/


        /*// 1nd way:
        java.util.Date date = new java.util.Date();
        System.out.println(date);

        // 2nd way:
        long millis = System.currentTimeMillis();
        java.util.Date date2 = new java.util.Date(millis);
        System.out.println(date2);

        // 3nd way:
        long millis3 = System.currentTimeMillis();
        java.sql.Date date3 = new java.sql.Date(millis);
        System.out.println(date3);

        // 4nd way:
        Date date4 = java.util.Calendar.getInstance().getTime();
        System.out.println(date4);

        //java.util.Calendar.getInstance().getTime();


        // Instantiate a Date object
        Date date5 = new Date();

        // 1st way: current time and date using toString()
        System.out.println(date5.toString());
        System.out.println(date5);

        // 2nd way: current time and date using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(dateFormat.format(date5));

        // Convert string to date
        SimpleDateFormat dateFormat2 = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        String strdate2 = "02-04-2013 11:35:42";
        try {
            Date newdate = dateFormat.parse(strdate2);
            System.out.println(newdate);
        } catch (Exception e) {
            e.getMessage();
        }

        // Date Comparison
        // 1st way: using before(), after(), equals()
        SimpleDateFormat dateformat3 = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date6 = dateformat3.parse("17/07/1989");
            Date date7 = dateformat3.parse("15/10/2007");

            System.out.println("Date1 is: " + dateformat3.format(date6));
            System.out.println("Date2 is: " + dateformat3.format(date7));

            if (date6.after(date7)) {
                System.out.println("Date1 is later than Date2");
            } else if (date6.before(date7)) {
                System.out.println("Date1 is earlier than Date2");
            } else if (date6.equals(date7)) {
                System.out.println("Date1 is the same with Date2");
            }

            // 2nd way: using compareTo()
            date6 = dateformat3.parse("27/09/2012");
            date7 = dateformat3.parse("27/09/2009");

            System.out.println("Date1 is: " + dateformat3.format(date6));
            System.out.println("Date2 is: " + dateformat3.format(date7));

            if (date6.compareTo(date7) > 0) {
                System.out.println("Date1 is later than Date2");
            } else if (date6.compareTo(date7) < 0) {
                System.out.println("Date1 is earlier than Date2");
            } else if (date6.compareTo(date7) == 0) {
                System.out.println("Date1 is the same with Date2");
            }

        } catch (Exception e) {
            e.getMessage();
        }*/

    }
}
