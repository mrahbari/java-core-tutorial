package strings;

import java.util.StringJoiner;

/**
 * Created by mrahbari on 06/06/2015.
 */
public class Method {

    public static void main(String argv[]) {

        /*String name01 = "javatpoint";
        char ch = name01.charAt(4);//returns the char value at the 4th index
        System.out.println(ch); //t


        // s1 > s2 => positive number
        // s1 < s2 => negative number
        // s1 == s2 => 0
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "meklo";
        String s4 = "hemlo";
        System.out.println(s1.compareTo(s2));    // 0
        System.out.println(s2.compareTo(s3));   // -5
        System.out.println(s3.compareTo(s4));   // +5

        //The java string concat() method combines specified string at the end of this string. It returns combined string. It is like appending another string.
        String s5 = "java string";
        s5.concat("is immutable");
        s5 = s5.concat(" is immutable so assign it explicitly");
        System.out.println(s5);


        //The java string contains() method searches the sequence of characters in this string. It returns true if sequence of char values are found in this string otherwise returns false.
        String name = "what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));

        // The java string endsWith() method checks if this string ends with given suffix. It returns true if this string ends with given suffix else returns false.
        System.out.println(name.endsWith("mee"));
        System.out.println(name.startsWith("what"));


        // The java string equals() method compares the two given strings based on the content of the string. If any character is not matched, it returns false. If all characters are matched, it returns true.
        String s001="javatpoint";
        String s002="javatpoint";
        String s003="JAVATPOINT";
        String s004="python";
        System.out.println(s001.equals(s002));//true because content and case is same
        System.out.println(s001.equals(s003));//false because case is not same
        System.out.println(s001.equalsIgnoreCase(s003));//true because case is not same
        System.out.println(s001.equals(s004));//false because content is not same

        //The java string getBytes() method returns the byte array of the string. In other words, it returns sequence of bytes.
        String a1="ABCDEFG";
        byte[] barr=a1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }


        // The java string indexOf() method returns index of given character value or substring.
        // If it is not found, it returns -1. The index counter starts from zero.
        // the same as strpos in php
        String s0001="this is index of example";
        //passing substring
        int index1=s0001.indexOf("is");//returns the index of is substring
        int index2=s0001.indexOf("index");//returns the index of index substring
        System.out.println(index1+"  "+index2);//2 8

        //passing substring with from index
        int index3=s0001.indexOf("is",4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

        //passing char value
        int index4=s0001.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
        */

        // The java string intern() method returns the interned string. It returns the canonical representation of string.
        String s1 = new String("hello");
        String s2 = "hello";
        String s3 = s1.intern();//returns string from pool, now it will be same as s2
        System.out.println(s1 == s2);//false because reference is different
        System.out.println(s2 == s3);//true because reference is same


        // The java string join() method returns a string joined with given delimiter. In string join method, delimiter is copied for each elements.
        String string1 = String.join("*", "Welcome", "to", "My", "Country");
        System.out.println(string1); //Welcome*to*My*Country


        // In Java 8 we finally can join Strings!
        StringJoiner joiner = new StringJoiner(",");
        joiner.add("foo");
        joiner.add("bar");
        joiner.add("baz");
        String joined = joiner.toString();
        System.out.println(joined); //foo,bar,baz


        // add() calls can be chained
        String joined2 = new StringJoiner("-").add("foo").add("bar").add("baz").toString(); // "foo-bar-baz"
        System.out.println(joined2);    //foo-bar-baz

        String x1 = "javatpoint is a very good website";
        String replaceString = x1.replace('a', 'A');
        System.out.println(x1);             //javatpoint is a very good website
        System.out.println(replaceString);  //jAvAtpoint is A very good website



        // The java string split() method splits this string against given regular expression and returns a char array.
        String text1 = "java string split method by javatpoint";
        String[] words = text1.split("\\s");//splits the string based on string
        //using java foreach loop to print elements of string array
        for (String w : words) {
            System.out.println(w);
        }


        String a = "9mohsen";
        String b = "10mohammad mohsen";
        System.out.println(a.compareToIgnoreCase(b));   //1

    }


}