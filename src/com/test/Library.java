package com.test;

import java.util.ArrayList;
import java.util.List;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
    }

    public void updateBook(Book b) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == b.getId()) {
                books.get(i).setBookName(b.getBookName());
                books.get(i).setBookPrice(b.getBookPrice());
                books.get(i).setBookWriter(b.getBookWriter());

            }
        }
    }
    public boolean deleteBook(int bookId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId()==bookId){
                books.remove(i);
                    return true;
            }

        }
        return false;
    }

    public ArrayList<Book> searchBywriterName(String writerName){
        ArrayList<Book>foundBooks=new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBookWriter().contains(writerName)){
                foundBooks.add(books.get(i));
            }
        }
        return foundBooks;

    }
    public Book searchById(int bookId)
    {
        for (int i = 0; i < books.size(); i++)
        {
            if (books.get(i).getId()==(bookId))
            {
                return books.get(i);
            }
        }

        return null;

    }

}
