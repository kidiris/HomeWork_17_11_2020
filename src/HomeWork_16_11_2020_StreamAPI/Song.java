package HomeWork_16_11_2020_StreamAPI;

public class Song {
    public String name;
    public Artist artist;
    public int time;
    public Genre genre;

    public Song(String name, Artist artist, int time, Genre genre){
        this.name=name;
        this.artist=artist;
        this.time=time;
        this.genre=genre;
    }

    public String getName(){
        return name;
    }

    public Artist getArtist(){
        return artist;
    }
    public int getTime(){
        return time;

    }
    public Genre getGenre(){
        return genre;
    }
    @Override
    public String toString() {
        return "{" +
                "name = " + name + '\'' +
                ", artist = " + artist +
                ", time = " + time +
                ", genre = " + genre +
                '}';
    }

}
