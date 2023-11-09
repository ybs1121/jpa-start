package com.example.stratjpa.course.jpa;

import com.example.stratjpa.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    //    @Autowired
    @PersistenceContext
    private EntityManager em;

    public void insert(Course course) {
        em.merge(course);
    }

    public Course findById(long id) {
        return em.find(Course.class, id);
    }

    public void deleteById(long id) {
        em.remove(em.find(Course.class, id));
    }
}
