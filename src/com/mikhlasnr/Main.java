package com.mikhlasnr;
/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Membuat object Film dan menampilkannya Latihan 32
 *
 */
public class Main extends Film{
    public static void main(String[] args) {
        // Create instance
        Main filmPertama = new Main();
        Main filmKedua = new Main();
        Main filmKetiga = new Main();
        Main filmKeempat = new Main();

        // Assign value
        filmPertama.filmName = "Venom";
        filmPertama.filmGenre = "Action, Horror, Scifi";
        filmPertama.filmRating = 8.5;
        filmPertama.filmDuration = 120;

        filmKedua.filmName = "Small Foot";
        filmKedua.filmGenre = "Animation";
        filmKedua.filmRating = 9.0;
        filmKedua.filmDuration = 96;

        filmKetiga.filmName = "Crazy Rich Asian";
        filmKetiga.filmGenre = "Comedy";
        filmKetiga.filmRating = 7.8;
        filmKetiga.filmDuration = 119;

        filmKeempat.filmName = "Asih";
        filmKeempat.filmGenre = "Horror";
        filmKeempat.filmRating = 6.0;
        filmKeempat.filmDuration = 100;

        // Show Film
        System.out.println("===Daftar Film Sedang Tayang===\n");
        filmPertama.nowPlaying();
        filmKedua.nowPlaying();
        filmKetiga.nowPlaying();
        filmKeempat. nowPlaying();
    }
}
