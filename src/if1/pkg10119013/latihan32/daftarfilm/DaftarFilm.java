/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan32.daftarfilm;

/**
 *
 * @author Fiona Avila
 */


public class DaftarFilm {
    
    String filmName;
    String filmGenre;
    double filmRating;
    int filmDuration;
    
    public void nowPlaying(){
        System.out.println("Judul Film\t: " + filmName);
        System.out.println("Genre Film\t: " + filmGenre);
        System.out.println("Rating Film\t: " + filmRating);
        System.out.println("Duration Film\t: " + filmDuration + " menit");
    }
    
    public static void main(String[] args) {
        
        System.out.println("===DAFTAR FILM SEDANG TAYANG===");
        System.out.println();
        
        //Data Film 1
        DaftarFilm film1 = new DaftarFilm();
        film1.filmName = "Venom";
        film1.filmGenre = "Action, Horror, Scifi";
        film1.filmRating = 8.5;
        film1.filmDuration = 120;
       
        //Data Film 2
        DaftarFilm film2 = new DaftarFilm();
        film2.filmName = "Small Foot";
        film2.filmGenre = "Animation";
        film2.filmRating = 9.0;
        film2.filmDuration = 96;
        
        //Data Film 3
        DaftarFilm film3 = new DaftarFilm();
        film3.filmName = "Crazy Rich Asian";
        film3.filmGenre = "Comedy";
        film3.filmRating = 7.8;
        film3.filmDuration = 119;
        
        //Data Film 4
        DaftarFilm film4 = new DaftarFilm();
        film4.filmName = "Asih";
        film4.filmGenre = "Horror";
        film4.filmRating = 6.0;
        film4.filmDuration = 100;
        
        film1.nowPlaying();
        System.out.println();
        film2.nowPlaying();
        System.out.println();
        film3.nowPlaying();
        System.out.println();
        film4.nowPlaying();
    }
    
}
