package part4.bbb;

import java.util.ArrayList;
import java.util.Scanner;

public class book {

    String title;
    int numOfPages;
    int yearofPub;
    
    public book(String title, int pages, int year){
        this.title = title;
        this.numOfPages = pages;
        this.yearofPub = year;

    }

    public String getTitle(){
        return title;

    }
    public int getPages(){
        return numOfPages;

    }
    public int getPubYear(){
        return yearofPub;
    }

    public String toString(){
        return "the title of the book is " + this.title + " the number of pages in the book is " + this.numOfPages + "the publication year is  " + this.yearofPub;
    }



    public static void main(String[] args) {
        ArrayList<book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter the details of the book in the format  eg The power of Subconcious mind, 211, 2001");
                String input = scan.nextLine();
            if (input.isEmpty()) {
                break;
                
            }

            String [] parts = input.split(",");
            String name = parts[0];
            int pages = Integer.valueOf(parts[1]);
            int year = Integer.valueOf(parts[2]);

            books.add(new book(name, pages, year));




          


            
        }

        System.out.println("what do you want? ( Title, year, pages, everything)");

        String demand = scan.nextLine();

        for(book Book : books){
             if (demand.equals("title")) {
                System.out.println(Book.getTitle());



            
            }else if (demand.equals("year")) {
                System.out.println(Book.getPubYear());
                
            }else if (demand.equals("pages")) {
                System.out.println(Book.getPages());
                
            }else {
                System.out.println(" The title is :  " + Book.getTitle());
                System.out.println("the number of pages is " + Book.getPages());
                System.out.println("the year of publication is "+ Book.getPubYear());
                System.out.println( "  ");
            }

        
        }

       
    }

}
