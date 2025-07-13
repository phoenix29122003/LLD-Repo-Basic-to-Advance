package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern;

import java.util.List;

public class SongIterator implements Iterator{
    private List<Song>songs;
    private Integer idx;

    public SongIterator(List songs){
        this.songs=songs;
        idx=0;
    }

    public boolean hasNext(){
        return idx<songs.size();
    }

    public Song next(){
        return songs.get(idx++);
    }
}
