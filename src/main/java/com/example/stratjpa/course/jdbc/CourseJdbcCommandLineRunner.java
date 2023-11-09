package com.example.stratjpa.course.jdbc;

import com.example.stratjpa.course.Course;
import com.example.stratjpa.course.jpa.CourseJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository courseJdbcRepository;
    private final CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
//        courseJdbcRepository.insert(new Course(1,"Learn Java","Eddie"));
//        courseJdbcRepository.insert(new Course(2,"Learn AWS","Eddie"));
//        courseJdbcRepository.delete(new Course(1,"s","s"));
//        System.out.println(courseJdbcRepository.findById(2).toString());

        Course course = new Course();
        course.setId(3);
        course.setName("TESERT");
        course.setAuthor("1133");
        Course course2 = new Course();
        course2.setId(4);
        course2.setName("TESERT");
        course2.setAuthor("1133");

        courseJpaRepository.insert(course);
        courseJpaRepository.insert(course2);
        System.out.println(courseJpaRepository.findById(3));
        courseJpaRepository.deleteById(4);
    }
}
