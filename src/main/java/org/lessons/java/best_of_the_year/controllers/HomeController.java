package org.lessons.java.best_of_the_year.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model, String username) {
        // In each controller method, add:
        model.addAttribute("currentPage", "home");
        model.addAttribute("username", "Leonardo");
        return "home";
    }

    @GetMapping("/movies")
    public String movies(Model model) {
        model.addAttribute("currentPage", "movies");
        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {
        model.addAttribute("currentPage", "songs");
        return "songs";
    }

}
