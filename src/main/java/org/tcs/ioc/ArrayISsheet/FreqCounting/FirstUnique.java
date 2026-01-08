package org.tcs.ioc.ArrayISsheet.FreqCounting;

import java.util.HashMap;
import java.util.Map;

public class FirstUnique {
    public static void main(String[] args) {
  String str="leetcode";

  int index= firstnonrepchar(str);
        System.out.println(index);
    }

    private static int firstnonrepchar(String str) {

        int index=-1;

        Map<Character,Integer> fremap= new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            fremap.put(ch,fremap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(fremap.get(str.charAt(i))==1){
                index=i;
                break;
            }
        }
        return  index;
    }
}
