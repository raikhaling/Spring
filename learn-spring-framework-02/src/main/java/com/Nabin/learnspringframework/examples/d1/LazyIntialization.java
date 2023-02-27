package com.Nabin.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.Nabin.learnspringframework.exercise.Data.DataService;
import com.Nabin.learnspringframework.game.GameRunner;


@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA){
		//Logic here
		System.out.println("Some initial intialization");
		this.classA = classA;
	}

	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Method of B");
		
	}
}

@Configuration
@ComponentScan
public class LazyIntialization {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext
				(LazyIntialization.class)) {
			
			System.out.println("Initialization of context is complete..");
			
			context.getBean(ClassB.class).doSomething();

		}

	}
}
