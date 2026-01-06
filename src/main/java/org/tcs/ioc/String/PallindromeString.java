package org.tcs.ioc.String;

public class PallindromeString {

    //reverse and then check

    public static void main(String[] args) {

        String str="madama";

        char [] ch=str.toCharArray();
        int i=0;
        int j=str.length()-1;

        while(i<j){
           char temp =ch[i];
           ch[i]=ch[j];
           ch[j]=temp;
           i++;
           j--;
        }
        String rev= new String(ch);
        if(str.equals(rev)){
            System.out.println("Pallindrome");
        }else {
            System.out.println("not pallindrome");
        }
    }
}
