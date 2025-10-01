package org.example;

public class Movie extends LibraryItem {
    protected int durationInMinutes;

    public Movie () {
        super();
        this.durationInMinutes = 0;
    }

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, year, author);
        this.durationInMinutes = durationInMinutes;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    @Override
    public String toString() {
        //Movie: <title> by <author> (<year>) - <durationInMinutes> minutes
        return "Movie: " + this.title + " by " + this.author + " (" + this.year + ") - " + this.durationInMinutes + " minutes";
    }
}
