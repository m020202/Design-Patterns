package com.pattern.design_patterns.creational_patterns.builder.java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class BuilderInSpring {
    public static void main(String[] args) {
        UriComponents howToStudyJava = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java-play list-ep1")
                .build().encode();
        System.out.println(howToStudyJava);
    }
}
