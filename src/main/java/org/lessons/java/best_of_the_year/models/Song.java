package org.lessons.java.best_of_the_year.models;

public class Song {

    private int id;
    private String title;
    private String artist;
    private double minutesLength;
    private int releaseYear;

    public Song(int id, String title, String artist, double minutesLength, int releaseYear) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.minutesLength = minutesLength;
        this.releaseYear = releaseYear;

    }

    public Song() {
    };

    //> GETTERS
    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public double getSongLength() {
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

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongLength(double minutesLength) {
        this.minutesLength = minutesLength;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

}
