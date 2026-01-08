package org.tcs.ioc.ArrayISsheet.FreqCounting;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstUniqueCharstreamapi {

    public static void main(String[] args) {

        String str="leetcode";

        LinkedHashMap<Character,Long> map= str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
        System.out.println(map);

        //first
         Optional<Map.Entry<Character, Long>> ch=map.entrySet().stream()
                .filter(key->key.getValue()==1)
                .findFirst();
        System.out.println(ch);

    }
}
