package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "category")
    private Collection<GameReview> reviews;

    public Category(String name) {
        this.name = name;
    }

    public Category(){}

    public Long getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<GameReview> getReviews() {
        return reviews;
    }
}
