package org.example;

public class LibraryItem {
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem() {
        this.title = "unknown title";
        this.author = "unknown author";
        this.year = 0;
    }

    public LibraryItem(String title, int year, String author) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String toString() {
        //Item: <title> by <author> (<year>)
        return "Item: " + this.title + " by " + this.author + " (" + this.year + ")";
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }
}
