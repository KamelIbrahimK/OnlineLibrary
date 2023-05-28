package com.test;

public class Book {
    private String BookName;
    private Double BookPrice;
    private String BookWriter;
    private int Id;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public Double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        BookPrice = bookPrice;
    }

    public String getBookWriter() {
        return BookWriter;
    }

    public void setBookWriter(String bookWriter) {
        BookWriter = bookWriter;
    }
}

