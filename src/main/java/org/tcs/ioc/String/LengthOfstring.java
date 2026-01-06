package org.tcs.ioc.String;

public class LengthOfstring {

    public static void main(String[] args) {

        String str="Priyanka is";

        int length=0;
        int count=0;
        for(int i=0;i<str.length();i++){
            length++;
        }

        for(char ch:str.toCharArray()){
            count ++;
        }
        System.out.println(length);
        System.out.println(count);

        //streamapi
        long coutstring=str.chars().count();
        System.out.println(coutstring);
    }
}
