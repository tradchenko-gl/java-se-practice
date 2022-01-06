package section9.exercises.ex48InnerClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong (String name, double duration) {
        if(songs.findSong(name) == null) {
            songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if(trackNumber > 0 && trackNumber <= songs.songs.size()) {
            playList.add(songs.songs.get(trackNumber-1));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = songs.findSong(songTitle);
        if(song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    public void printSongsList() {
        songs.printSongs();
    }


    private class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add (Song song) {
            if (songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong (String title) {
            for (int i = 0; i < songs.size(); i++) {
                if(songs.get(i).getTitle() == title) {
                    return songs.get(i);
                }
            }
            return null;
        }

        private Song findSong (int trackNumber) {
            int index = trackNumber -1;
            if(index >= 0 && trackNumber < songs.size()) {
                return songs.get(index);
            }
            return null;
        }

        private void printSongs() {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println(i + ": " + songs.get(i).getTitle());
            }
        }
    }

}
