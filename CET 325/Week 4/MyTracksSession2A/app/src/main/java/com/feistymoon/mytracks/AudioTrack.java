package com.feistymoon.mytracks;


public class AudioTrack {

    private String title;
    private String artist;
    private String album;
    private double trackPrice;

    public AudioTrack(String pTitle, String pArtist, String pAlbum, double pPrice){
        title = pTitle;
        artist = pArtist;
        album = pAlbum;
        trackPrice = pPrice;
    }

    public String toString(){
        return("Artist: " + artist +
               "\nTitle: " + title +
                "\nAlbum: " + album +
                 "\nPrice: " + trackPrice );
    }

    public void setTitle(String pTitle){
        title = pTitle;
    }

    public void setArtist(String pArtist){
        artist = pArtist;
    }

    public void setTrackPrice(double pTrackPrice){
        trackPrice = pTrackPrice;
    }

    public void setAlbum(String pAlbum){
        album = pAlbum;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public double getTrackPrice(){
        return trackPrice;
    }

    public String getAlbum(){
        return album;
    }


}
