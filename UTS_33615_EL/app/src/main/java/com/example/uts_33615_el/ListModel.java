package com.example.uts_33615_el;

public class ListModel {
    String songTitle, songSinger;
    Integer SongsCover;

    public ListModel(String songTitle, String songSinger) {
        this.songTitle = songTitle;
        this.songSinger = songSinger;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getSongSinger() {
        return songSinger;
    }

    public void setSongSinger(String songSinger) {
        this.songSinger = songSinger;
    }
}
