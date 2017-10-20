package haaga.lms.lms.domain;

import org.springframework.data.repository.CrudRepository;

import haaga.lms.lms.domain.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
	Course findByCoursename(String coursename); 
}