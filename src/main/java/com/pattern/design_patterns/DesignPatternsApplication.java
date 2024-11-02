package com.pattern.design_patterns;

import com.pattern.design_patterns.singleton.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		SpringApplication.run(DesignPatternsApplication.class, args);
		Settings settings = Settings.getInstance();

		Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Settings settings1 = constructor.newInstance();

		System.out.println(settings == settings1);
	}

}
