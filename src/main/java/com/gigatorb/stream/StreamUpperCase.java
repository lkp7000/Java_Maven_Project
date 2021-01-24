package com.gigatorb.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUpperCase {
    public static void main(String[] args){
        // Logic to make letter upper case
        List<String> alphabetList = Arrays.asList("a", "b", "c", "d", "e");
        List<String> alphabetUpperList = alphabetList.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println(alphabetUpperList);
    }
}
