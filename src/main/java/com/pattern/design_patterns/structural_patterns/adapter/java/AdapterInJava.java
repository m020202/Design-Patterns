package com.pattern.design_patterns.structural_patterns.adapter.java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        // Arrays.asList
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(System.out::println);

        // Collections <-> Enumeration
        Enumeration<String> enumeration = Collections.enumeration(list);
        ArrayList<String> list2 = Collections.list(enumeration);

        // io
        try (InputStream is = new FileInputStream("input.txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader reader = new BufferedReader(isr)) {
            while (reader.ready()) {
                System.out.println(reader);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
