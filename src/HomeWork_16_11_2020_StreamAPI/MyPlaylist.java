package HomeWork_16_11_2020_StreamAPI;

import java.util.ArrayList;

public class MyPlaylist {
    public String nameOwner;
    public ArrayList<Album> albums =new ArrayList<Album>();

    public MyPlaylist(String nameOwner, ArrayList<Album> albums){
        this.nameOwner=nameOwner;
        this.albums=albums;
    }
    public String getNameOwner(){
        return nameOwner;
    }
    public ArrayList<Album> getAlbums(){
        return albums;
    }
}
