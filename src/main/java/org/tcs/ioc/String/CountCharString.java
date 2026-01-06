package org.tcs.ioc.String;

public class CountCharString {

    public static void main(String[] args) {

        String str="Priyanka";

        int count=0;

        for(int i=0;i<str.length();i++){
            count++;
        }
        System.out.println(count);

        //stream api

        long count1= str.chars()
                .filter(Character::isLetter)
                .count();
        System.out.println(count1);
    }
}
