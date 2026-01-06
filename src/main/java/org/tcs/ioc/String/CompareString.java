package org.tcs.ioc.String;

public class CompareString {

    public static void main(String[] args) {
        String str1="Priyanka";
        String str2="Priyanka";

        String str3= new String("Priyanka");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        System.out.println(str1.equals(str3));



    }

    }

