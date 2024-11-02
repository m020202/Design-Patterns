package com.pattern.design_patterns;

import com.pattern.design_patterns.singleton.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException {
		SpringApplication.run(DesignPatternsApplication.class, args);
		Settings settings = Settings.INSTANCE;
		Settings settings1 = Settings.INSTANCE;

		System.out.println(settings1 == settings);
	}

}
