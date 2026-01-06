package org.tcs.ioc.String;

public class Removespace {

    public static void main(String[] args) {

        String str="Priyanka is java developer";

        String remspace= str.replace(" ","");
        String repAll= str.replaceAll("\\s+","");

        System.out.println(remspace);
        System.out.println(repAll);

        //manual
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
}
