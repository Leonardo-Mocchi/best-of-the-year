package org.lessons.java.best_of_the_year.controllers;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.best_of_the_year.models.Movie;
import org.lessons.java.best_of_the_year.models.Song;

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

        List<Movie> moviesList = getBestMovies();

        model.addAttribute("currentPage", "movies");
        model.addAttribute("mediaType", moviesList);

        return "movies";
    }

    @GetMapping("/songs")
    public String songs(Model model) {

        List<Song> songsList = getBestSongs();

        model.addAttribute("currentPage", "songs");
        model.addAttribute("mediaType", songsList);

        return "songs";
    }

    //, PRIVATE METHODS

    private List<Movie> getBestMovies() {
        Movie movie1 = new Movie(1, "Pulp Fiction", 154, 1994);
        Movie movie2 = new Movie(2, "Perfect Blue", 81, 1997);
        Movie movie3 = new Movie(3, "Paprika", 90, 2006);
        Movie movie4 = new Movie(4, "Tenet", 150, 2020);
        Movie movie5 = new Movie(5, "Taxi Driver", 114, 1976);
        Movie movie6 = new Movie(6, "Titanic", 195, 1997);

        List<Movie> movies = new ArrayList<>();

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);

        return movies;
    }

    private List<Song> getBestSongs() {
        Song song1 = new Song(1, "Infinity", "Infinity Ink", 3.48, 2012);
        Song song2 = new Song(2, "Yofukashi no Uta", "Creepy Nuts", 4.07, 2019);
        Song song3 = new Song(3, "Strobe", "Deadmau5", 10.34, 2009);
        Song song4 = new Song(4, "Hunnybee", "Unknown Mortal Orchestra", 4.32, 2018);
        Song song5 = new Song(5, "drugs", "EDEN", 5.38, 2016);
        Song song6 = new Song(6, "Boulevard of Broken Dreams", "Green Day", 4.22, 2009);

        List<Song> songs = new ArrayList<>();
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
        songs.add(song6);

        return songs;
    }

}
