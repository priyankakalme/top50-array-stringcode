package org.tcs.ioc.String;

import java.util.Set;

public class CountVowels {
    private  static  final Set<Character> Vowels= Set.of('a','e','i','o','u');
    public static void main(String[] args) {

        String str="Priyanka";

        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch=='a' || ch=='e'|| ch=='i' ||ch=='o' || ch=='u'){
                count++;

            }
        }

        System.out.println(count);

        //using set
int count1=0;
//        private  static  final Set<Character> Vowels= Set.of('a','e','i','o','u');
 for(int i=0;i<str.length();i++){
     char ch= Character.toLowerCase(str.charAt(i));
             if(Vowels.contains(ch)){
                 count1++;
             }
 }
        System.out.println(count1);

//stream api
        long countvowels= str.chars()
                .map(Character::toLowerCase)
                .filter(ch->ch=='a' || ch=='e'|| ch=='i' ||ch=='o' || ch=='u')
                .count();

        System.out.println(countvowels);
    }
}
