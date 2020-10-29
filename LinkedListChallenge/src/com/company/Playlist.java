package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Playlist {
    private static LinkedList<Song> songs;

    public Playlist() {
        this.songs = new LinkedList<Song>();
    }

    public static void addSong(Song song) {
        songs.add(song);
    }

    public static void removeSong(Song song) {
        songs.remove(song);
    }

    public static void nextSong() {
        Iterator<Song> i = songs.iterator();
        i.next();
    }

    public static void previousSong() {
        ListIterator<Song> i = songs.listIterator();
        i.previous();
    }

    public static void replaySong() {
        ListIterator<Song> i = songs.listIterator();
        i.previous();
    }

    public static void listSongs() {
        Iterator<Song> i = songs.iterator();

        while(i.hasNext()) {
            System.out.println(i.next().getTitle());
        }
    }
}






























