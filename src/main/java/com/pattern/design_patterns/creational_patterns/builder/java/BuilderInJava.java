package com.pattern.design_patterns.creational_patterns.builder.java;

import java.util.stream.Stream;

public class AdapterInJava {
    public static void main(String[] args) {
        // StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("white-ship ").append("J").toString();
        System.out.println(result);

        // Stream API
        Stream<String> result2 = Stream.<String>builder().add("J").add("white-ship").build();
        result2.forEach(System.out::println);
    }
}
