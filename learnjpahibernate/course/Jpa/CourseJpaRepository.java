package com.khaling.springboot.learnjpahibernate.course.Jpa;

import org.springframework.stereotype.Repository;

import com.khaling.springboot.learnjpahibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	//autowired but specific
	@PersistenceContext
	 private EntityManager entiyManager;
	 
	 public void insert(Course course) {
		 entiyManager.merge(course);
	 }
	 public Course findById(long i) {
		 return entiyManager.find(Course.class,i);
	 }
	 public void deleteById(long  i) {
		 Course course = entiyManager.find(Course.class,i);
		 entiyManager.remove(course);
	 }
	  
}
