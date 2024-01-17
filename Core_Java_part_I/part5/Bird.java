package part5;

import java.io.*; 
import java.util.*; 

public class Bird {
  
   private String name;
    
    public Bird(String name) {
        this.name = name;
    }  
    
    
    public static void main(String[] args) {


        ArrayList<Bird> birds = new ArrayList<>();
        Bird red = new Bird("Red");

        if (birds.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }

        birds.add(red);
        if (birds.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }


        System.out.println("However!");

        red = new Bird("Red");
        if (birds.contains(red)) {
            System.out.println("Red is on the list.");
        } else {
            System.out.println("Red is not on the list.");
        }
            }
    
    
}