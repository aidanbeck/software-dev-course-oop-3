package org.example;

public class Book extends LibraryItem {
    protected int pageCount;

    public Book() {
        super();
        this.pageCount = 0;
    }

    public Book(String title, String author, int year, int pageCount) {
        super(title, year, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    @Override
    public String toString() {
        //"Book: <title> by <author> (<year>) - <pageCount> pages"
        return "Book: " + this.title + " by " + this.author + " (" + year + ") - " + this.pageCount + " pages";
    }

    public void readBook() {
        //Reading <title> by <author>...
        //Done!
        System.out.println("Reading " + this.title + " by " + this.author + "...");
        System.out.println("Done!");
    }
}
