package com.example.stratjpa.course.jdbc;

import com.example.stratjpa.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static String QUERY =
            """
                    insert into course (id, name, author) values (?,?,?);
                    """;
    private static String DELETE_QUERY =
            """
                    delete from course where id = ?;
                    """;
    private static String SELECT_QUERY =
            """
                    select * from course where id = ?;
                    """;

    public void insert(Course course) {
        jdbcTemplate.update(QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete(Course course) {
        jdbcTemplate.update(DELETE_QUERY, course.getId());
    }

    public Course findById(long id) {
        Course course = jdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
        return course;
    }
}
