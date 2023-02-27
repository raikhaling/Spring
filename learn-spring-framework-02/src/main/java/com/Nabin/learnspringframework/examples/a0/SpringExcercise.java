package com.Nabin.learnspringframework.examples.a0;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.Nabin.learnspringframework.exercise.Data.DataService;
import com.Nabin.learnspringframework.game.GameRunner;

@Configuration
@ComponentScan("com.Nabin.learnspringframework.exercise.Data")
public class SpringExcercise
{
	@Qualifier("sql")
	static  DataService dataservice;
	
	@Autowired 
	SpringExcercise(DataService dataservice){
		this.dataservice = dataservice;
	}
	
	
	public static void main(String[] args) {
		
		
		try (var context = new AnnotationConfigApplicationContext
				(SpringExcercise.class)) {
			
			
			
			int[] arr = context.getBean(DataService.class).retrieveData();
			for(int i : arr) {
				System.out.println(i);
			}
			System.out.println("Findin Max:.....");
			System.out.println(findMax());
			
			
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);
		} 
		
	}
	public static int findMax() {
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
	}

}
