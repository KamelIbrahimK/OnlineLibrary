package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Library l = new Library();


        while (true)
        {
            System.out.println("press1 to add book , 2to update book ,3 to delete book or 4 to search by the book writer name ");
            int choise = s.nextInt();

            if (choise == 1) {
                Book b = new Book();
                System.out.println("please enter your book id ");
                b.setId(s.nextInt());
                s=new Scanner(System.in);
                System.out.println("please enter your book Name ");
                b.setBookName(s.nextLine());
                System.out.println("please enter your book price ");
                b.setBookPrice(s.nextDouble());
                s=new Scanner(System.in);
                System.out.println("please enter your book writer ");
                b.setBookWriter(s.nextLine());

                l.addBook(b);
            } else if (choise == 2)
            {
                System.out.println("please enter your book id ");
                Book foundBook = l.searchById(s.nextInt());
                if (foundBook != null)
                {
                    System.out.println("to update book name press1,press2 to update book price.3 to book writer");
                    int updatechoice = s.nextInt();
                    if (updatechoice == 1)
                    {
                        System.out.println("please enter the book name value");
                        foundBook.setBookName(s.nextLine());
                    }
                    else if (updatechoice == 2)
                    {
                        System.out.println("please enter the book price value");
                        foundBook.setBookPrice(s.nextDouble());
                    }
                    else if (updatechoice == 3)
                    {
                        System.out.println("please enter the book writer name  value");
                        foundBook.setBookWriter(s.nextLine());
                    }
                    l.updateBook(foundBook);
                }
                else
                    System.out.println("there is no book matches with your id ");

            }
            else if (choise==3){
                System.out.println("please enter the book id whitch you want to delete it ");
               boolean deleted= l.deleteBook(s.nextInt());
                if (deleted==true)
                {
                    System.out.println("deleted");
                }
                else
                    System.out.println("please enter a valid id" );

            }
            else if (choise==4){ 
                System.out.println("please enter the book  wrier name ");
                s=new Scanner(System.in);
                String writerName=s.nextLine();
                l.searchBywriterName(writerName);
                ArrayList<Book>serchbooks=l.searchBywriterName(writerName);
                for (int i = 0; i < serchbooks.size(); i++) {
                    System.out.println(serchbooks.get(i).getBookName());
                    System.out.println(serchbooks.get(i).getBookWriter());
                    System.out.println(serchbooks.get(i).getBookPrice());

                }

            }

        }
    }


}
