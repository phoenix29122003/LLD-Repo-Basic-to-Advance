package DesignPatterns.BehaviouralDesignPattern.IteratorDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        Playlist playlist=new Playlist();
        
        Song song1 = new Song("Bohemian Rhapsody", "Queen", "5.55");
        Song song2 = new Song("Shape of You", "Ed Sheeran", "4.24");
        Song song3 = new Song("Blinding Lights", "The Weeknd", "3.20");

        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        Iterator songIterator=playlist.getIterator();

        while(songIterator.hasNext()){
            Song song = songIterator.next();
            System.out.println("Song name: "+song.name);
            System.out.println("Song author: "+song.artist);
            System.out.println("Song duration: "+song.duration);

            System.out.println("");
        }
    }
}
