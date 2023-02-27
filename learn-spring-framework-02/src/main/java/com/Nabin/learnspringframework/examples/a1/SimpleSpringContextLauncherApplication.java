package com.Nabin.learnspringframework.examples.a1;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Nabin.learnspringframework.game.GameRunner;

@Configuration
//@ComponentScan("com.Nabin.learnspringframework.examples.a1") automatically scans its current page
@ComponentScan
public class SimpleSpringContextLauncherApplication
{
	
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(SimpleSpringContextLauncherApplication.class)) {
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			
		} 
		
	}

}
