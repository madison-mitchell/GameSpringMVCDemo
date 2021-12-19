package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id@GeneratedValue
    private Long id;
    private String hashtagName;

    @ManyToMany(mappedBy = "hashtags")
    private Collection<GameReview> gameReviews;

    public Hashtag(String hashtagName) {
        this.hashtagName = hashtagName;
        this.gameReviews = new ArrayList<>();
    }

    public Hashtag(){}

    public String getHashtagName() {
        return hashtagName;
    }

    public Collection<GameReview> getGameReviews() {
        return gameReviews;
    }
}
