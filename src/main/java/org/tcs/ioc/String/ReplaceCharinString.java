package org.tcs.ioc.String;

public class ReplaceCharinString {

    public static void main(String[] args) {

        String str="Priyccankaccc";

       String strnew= str.replace("c","");
        System.out.println(strnew);

        //manual
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if(ch!='c'){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
