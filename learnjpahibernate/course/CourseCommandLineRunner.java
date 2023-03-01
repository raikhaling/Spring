package com.khaling.springboot.learnjpahibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.khaling.springboot.learnjpahibernate.course.Course;
import com.khaling.springboot.learnjpahibernate.course.Jpa.CourseJpaRepository;
import com.khaling.springboot.learnjpahibernate.course.jdbc.CourseJdbcRepository;
import com.khaling.springboot.learnjpahibernate.springJpa.CourseSpringDataRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
 
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataRepository repository;
	

	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Java spring JPA", "Goslingg"));
		repository.save(new Course(2, "Spring spring JPA", "khaling"));
		repository.save(new Course(3, "hibernater spring JPA", "nigga"));
		repository.deleteById(2l);
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(1l));
		System.out.println(repository.findAll());
		System.out.println(repository.findByAuthor("nigga"));
		System.out.println(repository.findByName("hibernater spring JPA"));
		System.out.println(repository.findByName(""));
	}

}
