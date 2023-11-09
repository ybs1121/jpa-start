package com.example.stratjpa.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Course")
public class Course {
    @Id
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
}
