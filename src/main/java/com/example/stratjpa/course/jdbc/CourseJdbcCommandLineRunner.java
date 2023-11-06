package com.example.stratjpa.course.jdbc;

import com.example.stratjpa.course.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    private final CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1,"Learn Java","Eddie"));
        courseJdbcRepository.insert(new Course(2,"Learn AWS","Eddie"));
        courseJdbcRepository.delete(new Course(1,"s","s"));
    }
}
