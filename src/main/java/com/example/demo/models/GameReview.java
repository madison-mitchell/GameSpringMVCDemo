package com.example.demo.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class GameReview {
    @Id
    @GeneratedValue
    private Long id;
    private String gameTitle;
    private String gamePlatforms;
    private String imageUrl;
    private String imageAltText;
    private String reviewTitle;

    //Increases character limit!
    @Lob
    private String reviewContent;

    @ManyToOne
    private Category category;

    @ManyToMany
    private Collection<Hashtag> hashtags;

    public GameReview(String gameTitle, String gamePlatforms, String imageUrl, String imageAltText, String reviewTitle, String reviewContent, Category category, Hashtag ...hashtags) {
        this.gameTitle = gameTitle;
        this.gamePlatforms = gamePlatforms;
        this.imageUrl = imageUrl;
        this.imageAltText = imageAltText;
        this.reviewTitle = reviewTitle;
        this.reviewContent = reviewContent;
        this.category = category;

        //TREY ASKED ABOUT VARARGS!!!!!!!!!!!!!!
        this.hashtags = List.of(hashtags);
    }

    public GameReview(){

    }



    public Long getId() {
        return id;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public String getGamePlatforms() {
        return gamePlatforms;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageAltText() {
        return imageAltText;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public Category getCategory() {
        return category;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }
}
