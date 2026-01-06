package org.tcs.ioc.String;

import java.util.Arrays;

public class CoundWordsinString {

    public static void main(String[] args) {

        String sentence = "Priyanka is Java Developer";
        char ch[]=sentence.toCharArray();
        int count =1;
        for(int i=0;i<sentence.length();i++){
            if(ch[i]== ' '){
                count++;

            }
        }
        System.out.println(count);

        //option b trim
        String trimmed= sentence.trim();
        String words[]= trimmed.split("\\s");
        System.out.println(words.length);
//stream api

        long wocoun= Arrays.stream(sentence.trim().split("\\s+"))
                .filter(s->!s.isEmpty())
                .count();
        System.out.println(wocoun);
    }
}
