package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	private List<Course> courses;
	
	public CourseServiceImpl() {
		courses = new ArrayList<Course>();
		courses.add(new Course(1,"Java", "Java Basics Course"));
		courses.add(new Course(2,"JavaScript", "JavaScript Basics Course"));
		courses.add(new Course(3,"React", "React Basics Course"));
	}

	@Override
	public List<Course> getCourses() {
		return courses;
	}

	@Override
	public Course getCourse(long courseId) {
		Optional<Course> course = courses.stream().filter(c -> c.getId() == courseId).findFirst();
		return course.get();
	}

	@Override
	public Course addCourse(Course course) {
		courses.add(course);	
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		int index = courses.indexOf(course);
		courses.set(index, course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		Optional<Course> course = courses.stream().filter(c -> c.getId() == courseId).findFirst();
		int index = courses.indexOf(course.get());
		courses.remove(index);
	}

}
