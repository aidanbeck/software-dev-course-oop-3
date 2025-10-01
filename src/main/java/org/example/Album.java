package org.example;

public class Album extends LibraryItem {
    protected int trackCount;

    public Album() {
        super();
        this.trackCount = 0;
    }

    public Album(String title, String author, int year, int trackCount) {
        super(title, year, author);
        this.trackCount = trackCount;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    @Override
    public String toString() {
        //Album: <title> by <author> (<year>) - <trackCount> tracks
        return "Album: " + this.title + " by " + this.author + " (" + this.year + ") - " + trackCount + " tracks";
    }
}
