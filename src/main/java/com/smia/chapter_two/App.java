package com.smia.chapter_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
    	SpringApplication.run(App.class, args);
    }
    
    public String hello() {
    	return "hello";
    }
}
