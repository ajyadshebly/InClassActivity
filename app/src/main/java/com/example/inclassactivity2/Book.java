package com.example.inclassactivity2;

public class Book {
    String BName;
    String Author;
    int page;

    public Book(){}
    public Book(String title, String author , int page1){
        this.BName = title;
        this.Author = author;
        this.page = page1;
    }

    public Book(String s, String s1) {
    }

    public String getBName() {
        return BName;
    }

    public void setBName(String BName) {
        this.BName = BName;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
