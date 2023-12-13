package com.dbmsproject.dbmsproject.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getallCourses(String topicId) {
        // return topics;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        // courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    public Optional<Course> getCourse(String id) {
        // return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findById(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
        // topics.add(course);
    }

    public void updatCourse(Course course) {
        // for (int i = 0; i < topics.size(); i++) {
        //     course t = topics.get(i);
        //     if (t.getId().equals(id)) {
        //         topics.set(i, course);
        //         return;
        //     }
        // }

        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        // topics.removeIf(t -> t.getId().equals(id));
        System.out.println(id);
        courseRepository.deleteById(id);
    }
}
