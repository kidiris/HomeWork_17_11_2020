package HomeWork_16_11_2020_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Artist a1 = new Artist("Kendrick Lamar", Country.USA, Type.SOLO);
        Artist a2 = new Artist("Ariana Grande", Country.USA, Type.SOLO);
        Artist a3 = new Artist("Bring me the horizon", Country.UK, Type.BAND);
        Artist a4 = new Artist("Paradis", Country.FRANCE, Type.BAND);
        Artist a5 = new Artist("Anderson.Paak", Country.USA, Type.SOLO);

        Artist[] artists = {a1, a2, a3, a4, a5};

        Song s1 = new Song("Alright", a1, 219, Genre.RAP);
        Song s2 = new Song("Make it Better", a5, 219, Genre.RnB);
        Song s3 = new Song("R.E.M", a2, 245, Genre.POP);
        Song s4 = new Song("Parasite Eve", a3, 291, Genre.ROCK);
        Song s5 = new Song("Toi et Moi", a4, 221, Genre.HOUSE);
        Song s6 = new Song("King Kunta", a1, 234, Genre.RAP);
        Song s7 = new Song("These walls", a1, 300, Genre.RAP);
        Song s8 = new Song("The Blacker The Berry", a1, 328, Genre.RAP);
        Song s9 = new Song("breathin", a2, 198, Genre.POP);
        Song s10 = new Song("no tears left to cry", a2, 205, Genre.POP);
        Song s11 = new Song("goodnight n go", a2, 189, Genre.POP);
        Song s12 = new Song("Teardrops", a3, 215, Genre.ROCK);
        Song s13 = new Song("1*1", a3, 209, Genre.ROCK);
        Song s14 = new Song("Ludens", a3, 280, Genre.ROCK);
        Song s15 = new Song("Come home", a5, 266, Genre.RnB);
        Song s16 = new Song("Jet Black", a5, 208, Genre.RnB);
        Song s17 = new Song("King James", a5, 197, Genre.RnB);
        Song s18 = new Song("Instante", a4, 381, Genre.HOUSE);
        Song s19 = new Song("Recto Verso", a4, 383, Genre.HOUSE);
        Song s20 = new Song("Quand Tu Souris", a4, 302, Genre.HOUSE);

        Song[] songs = {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20};
        //Collection<Song> c = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);


        Album al1 = new Album("To Pimp A Butterfly", new ArrayList<Song>(Arrays.asList(s1, s6, s7, s8)), 2015);
        Album al2 = new Album("Venture", new ArrayList<>(Arrays.asList(s2, s15, s16, s17)), 2019);
        Album al3 = new Album("sweetener", new ArrayList<>(Arrays.asList(s3, s9, s10, s11)), 2018);
        Album al4 = new Album("POST HUMAN", new ArrayList<>(Arrays.asList(s4, s12, s13, s14)), 2020);
        Album al5 = new Album("Recto Verso",new ArrayList<>(Arrays.asList(s5, s18, s19, s20)), 2016);

        Album[] albums ={al1, al2, al3, al4, al5};

        MyPlaylist p1 = new MyPlaylist("Ira", new ArrayList<>(Arrays.asList(al1, al2)));

        //выбрать песни длиной больше 300 секунд
        /*List<Song> longSong = c.stream().filter((x) -> x.getTime() >= 300).collect(Collectors.toList());
        System.out.println("longSong = " + longSong);*/

        Stream<Song> longSong = Arrays.stream(songs);
        longSong.filter(x->x.getTime()>=300).forEach(System.out::println);

        //все песни Anderson Paak
        Stream<Song> ap=Arrays.stream(songs);
        ap.filter(x->x.getName()=="Anderson.Paak").forEach(System.out::println);

        //все песни жанра Pop less than 200 s
        Stream<Song> pop = Arrays.stream(songs);
        pop.filter(x->x.getGenre()==Genre.POP).forEach(System.out::println);

        
    }
}
