package com.mikhlasnr;

public class Film {

    // Object Attribute
    public String filmName, filmGenre;
    public double filmRating;
    public int filmDuration;

    // Object Method
    public void nowPlaying() {
        System.out.println("Judul Film : " + filmName);
        System.out.println("Genre Film : " + filmGenre);
        System.out.println("Rating Film : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + "\n");
    }


}
