package com.springboot.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class App 
{
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello, 你好！";
	}
	
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	SpringApplication.run(App.class, args);
    }
}
