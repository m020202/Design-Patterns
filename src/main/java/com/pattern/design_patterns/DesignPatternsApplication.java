package com.pattern.design_patterns;

import com.pattern.design_patterns.singleton.Settings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		Settings settings = Settings.getInstance();
		Settings settings2 = Settings.getInstance();
		System.out.println(settings == settings2);

	}

}
