package com.Nabin.learnspringframework.exercise;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Nabin.learnspringframework.exercise.Data.BusinessCalculationService;
import com.Nabin.learnspringframework.exercise.Data.DataService;
import com.Nabin.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.Nabin.learnspringframework.exercise.Data")
public class SpringExcercise1
{
	
	
	
	public static void main(String[] args) {
		
		
		try (var context = new AnnotationConfigApplicationContext
				(SpringExcercise1.class)) {
			
			
			
			
			System.out.println("Findin Max:.....");
			System.out.println(context.getBean
					(BusinessCalculationService.class)
					.findMax());
			
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
		} 
		
	}
	

}
