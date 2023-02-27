package com.Nabin.learnspringframework.examples.f1;

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

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class someClass{
	SomeDependency somedependency;
	public someClass(SomeDependency somedependency) {
		this.somedependency = somedependency;
		System.out.println("All dependency are ready");
	}
	@PostConstruct
	public void initialize() {
		somedependency.getReady();
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Some clean up at the end");
	}
}

@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some Logic using somedepenedcy");

	}

}

@Configuration
@ComponentScan
public class PreConstructAnnotation {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(PreConstructAnnotation.class)) {

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}
}
