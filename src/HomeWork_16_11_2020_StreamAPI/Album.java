package HomeWork_16_11_2020_StreamAPI;

import java.util.ArrayList;

public class Album {
    public String name;
    public ArrayList<Song> songs = new ArrayList<Song>();
    public int year;

    public Album(String name, ArrayList<Song> songs, int year) {
        this.name = name;
        this.songs = songs;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "{" +
                "name = " + name + '\'' +
                ", songs = " + songs +
                ", year = " + year +
                '}';
    }
}
