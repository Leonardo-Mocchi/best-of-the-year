package org.lessons.java.best_of_the_year.models;

public class Movie {

    private int id;
    private String title;
    private int minutesLength;
    private int releaseYear;

    public Movie(int id, String title, int minutesLength, int releaseYear) {
        this.id = id;
        this.title = title;
        this.minutesLength = minutesLength;
        this.releaseYear = releaseYear;
    }

    public Movie() {
    };

    //> GETTERS
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public int getMovieLength() {
        return this.minutesLength;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    //> SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMovieLength(int minutesLength) {
        this.minutesLength = minutesLength;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
