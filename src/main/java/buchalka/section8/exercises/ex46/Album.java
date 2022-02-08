package buchalka.section8.exercises.ex46;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong (String name, double duration) {
        if(findSong(name) == null) {
            songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if(trackNumber > 0 && trackNumber <= songs.size()) {
            playList.add(songs.get(trackNumber-1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = findSong(songTitle);
        if(song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    private Song findSong (String name) {
        for (int i = 0; i < songs.size(); i++) {
            if(songs.get(i).getTitle() == name) {
                return songs.get(i);
            }
        }
        return null;
    }
}
