
import if01.pbo1.pkg10118009.latihan32.daftarfilm.dataFilm;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Daftar Film
 */

public class IF01PBO110118009Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dataFilm dftr = new dataFilm();
        
        System.out.println("====Daftar Film Sedang Tayang====");
        System.out.println();
        
        dftr.filmName = "Venom";
        dftr.filmGenre = "Action, Horror, Scifi";
        dftr.filmRating = "0.5";
        dftr.filmDuration = "96 Menit";
        dftr.nowPlaying();
        
        dftr.filmName = "Small Foot";
        dftr.filmGenre = "Animation";
        dftr.filmRating = "9.0";
        dftr.filmDuration = "96 Menit";
        dftr.nowPlaying();
        
        dftr.filmName = "Asih";
        dftr.filmGenre = "Horror";
        dftr.filmRating = "6.0";
        dftr.filmDuration = "100 Menit";
        dftr.nowPlaying();
    }

}
