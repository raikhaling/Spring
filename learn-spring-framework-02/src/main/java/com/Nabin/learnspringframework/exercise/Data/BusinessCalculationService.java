package com.Nabin.learnspringframework.exercise.Data;
import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.Nabin.learnspringframework.game.GameRunner;

@Component
public class BusinessCalculationService
{
	
   DataService dataservice;
	
	@Autowired 
	BusinessCalculationService(@Qualifier("sql")DataService dataservice){
		this.dataservice = dataservice;
	}
	
	
		
	public  int findMax() {
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
	}

}
