package org.tcs.ioc.ArrayISsheet.reverseArray;

import java.util.Arrays;

public class reverseString {
    public static void main(String[] args) {
        char[] s1={'h','e','l','l','o'};

        reveseString(s1);
        System.out.println(Arrays.toString(s1));
    }

    private static void reveseString(char[] s1) {
        int i=0;int j=s1.length-1;

        while (i<j){
            char temp=s1[i];
            s1[i]=s1[j];
            s1[j]=temp;
            i++;
            j--;
        }
    }

}
