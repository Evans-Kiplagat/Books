package com.example.book;

public class Bookmodel {
    private String name;
    private int pages;
    private String authr;
    private String describtion;
    private int bookid;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthr() {
        return authr;
    }

    public void setAuthr(String authr) {
        this.authr = authr;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }



    public Bookmodel(String name, int pages, String authr, String describtion, int bookid) {
        this.name = name;
        this.pages = pages;
        this.authr = authr;
        this.describtion = describtion;
        this.bookid = bookid;
    }

    @Override
    public String toString() {
        return "Bookmodel{" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ", authr='" + authr + '\'' +
                ", describtion='" + describtion + '\'' +
                ", bookid=" + bookid +
                '}';
    }
}
