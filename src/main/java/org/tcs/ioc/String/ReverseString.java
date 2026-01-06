package org.tcs.ioc.String;

public class ReverseString {

    public static void main(String[] args) {
        String str="Priyanka";
        char ch[]= str.toCharArray();

        int i=0;
        int j= str.length()-1;

        while(i<j){
            char temp= ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;

        }
        String rev= new String(ch);
        System.out.println(ch);

        //strig builder

        String str2="avinash";
        String rev2= new StringBuilder(str2).reverse().toString();
        System.out.println(rev2);
    }
}
