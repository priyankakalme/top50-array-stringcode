package org.tcs.ioc.String;

public class CountCons {

    public static void main(String[] args) {

        String str="Priyanka";

        int count=0;
        for(int i=0;i< str.length();i++){
            char ch= Character.toLowerCase(str.charAt(i));
            if(!(ch=='a' || ch=='e'|| ch=='i' ||ch=='o' || ch=='u')){
                count++;
            }
        }
        System.out.println(count);
//stream api

        long countconst= str.chars()
                .map(Character::toLowerCase)
                .filter(ch->"aeiou".indexOf(ch)==-1)
                .count();
    }
}
