package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements PlaylistInterface{
    private List<Song>songs=new ArrayList<>();

    public Playlist(){
        songs=new ArrayList<>();
    }

    public void addSong(Song song){
        songs.add(song);
    }

    public void removeSong(Song song){
        songs.remove(song);
    }

    @Override
    public Iterator getIterator(){
        return new SongIterator(songs);
    }
}
