package com.khaling.springboot.learnjpahibernate.springJpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khaling.springboot.learnjpahibernate.course.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author); 
	List <Course> findByName(String name);

}
