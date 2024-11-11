package com.pattern.design_patterns.structural_patterns.decorator.java;

import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {
    public static void main(String[] args) {
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

        // checkedList()
        ArrayList list = new ArrayList<>();
        list.add(new Book());

        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
        books.add(new Item());

        // HttpServlet 객체를 감싸는 방식
        HttpServletRequestWrapper httpServletRequestWrapper;
        HttpServletResponseWrapper httpServletResponseWrapper;
    }

    private static class Book {
    }

    private static class Item {
    }
}
