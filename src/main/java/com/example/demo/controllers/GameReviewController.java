package com.example.demo.controllers;

import com.example.demo.models.GameReview;
import com.example.demo.repos.GameReviewRepository;
import com.example.demo.repos.HashtagRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class GameReviewController {
    private GameReviewRepository gameReviewRepo;
    private HashtagRepository hashtagRepo;

    public GameReviewController(GameReviewRepository gameReviewRepo, HashtagRepository hashtagRepo) {
        this.gameReviewRepo = gameReviewRepo;
        this.hashtagRepo = hashtagRepo;
    }

    @RequestMapping("/gamereviews/{id}")
    public String displaySingleGameReview(@PathVariable Long id, Model model){

        Optional<GameReview> foundGame = gameReviewRepo.findById(id);
        model.addAttribute("singleGame",foundGame.get());

        return "singlegame.html";
    }


}
