package org.tcs.ioc.String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfStringChar {

    public static void main(String[] args) {

        String str="Priyanka";

        Map<Character,Integer> freq= new HashMap<>();

        for(char ch:str.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);

        //streamapi

        Map<Character,Long> mapcusingstream= str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mapcusingstream);
//sort by fre

//        Map<Character,Long> frebyass= mapcusingstream.entrySet().stream()
//                .sorted(Comparator.comparingLong
//                        ((Map.Entry<Character, Long> e) -> e.getValue())
//                        .thenComparingInt(Map.Entry::getKey))
//                .collect(Collectors.toMap(
//                        Map.Entry::getKey,
//                        Map.Entry::getValue,
//                        (a,b)->a, LinkedHashMap::new));
//        System.out.println(frebyass);
    }

}
