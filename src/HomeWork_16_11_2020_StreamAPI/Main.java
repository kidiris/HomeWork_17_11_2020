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

        Collection<Song> c = Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20);

        ArrayList<Song> songs1 = new ArrayList<>();
        songs1.add(s1);
        songs1.add(s6);
        songs1.add(s7);
        songs1.add(s8);

        Album al1 = new Album("To Pimp A Butterfly", songs1, 2015);

        ArrayList<Song> songs2 = new ArrayList<>();
        songs2.add(s2);
        songs2.add(s15);
        songs2.add(s16);
        songs2.add(s17);

        Album al2 = new Album("Venture", songs2, 2019);

        ArrayList<Song> songs3 = new ArrayList<>();
        songs3.add(s3);
        songs3.add(s9);
        songs3.add(s10);
        songs3.add(s11);

        Album al3 = new Album("sweetener", songs3, 2018);

        ArrayList<Song> songs4 = new ArrayList<>();
        songs4.add(s4);
        songs4.add(s12);
        songs4.add(s13);
        songs4.add(s14);

        Album al4 = new Album("POST HUMAN", songs4, 2020);

        ArrayList<Song> songs5 = new ArrayList<>();
        songs5.add(s5);
        songs5.add(s18);
        songs5.add(s19);
        songs5.add(s20);

        Album al5 = new Album("Recto Verso", songs5, 2016);
        ArrayList<Album> p = new ArrayList<>();
        p.add(al1);
        p.add(al2);
        p.add(al3);
        p.add(al4);
        p.add(al5);
        MyPlaylist p1 = new MyPlaylist("Ira", p);

        //выбрать песни длиной больше 300 секунд
        List<Song> longSong = c.stream().filter((x)->x.getTime()>=300).collect(Collectors.toList());
        System.out.println("longSong = " + longSong);
    }
}
