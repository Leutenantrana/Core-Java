package part4;

import java.util.Scanner;

public class moviedekhenge {

    String movieName; 
    int ageRestriction;
    public moviedekhenge(String movieName, int ageRestriction){
        this.movieName = movieName;
        this.ageRestriction = ageRestriction;

    }

    public int validAge(int age ){

        int a = age;
        return a; 
    }

    public String movieName(){
        return movieName;
    }

    public static void main(String[] args) {
        moviedekhenge shades = new moviedekhenge("the infinity shades of grey", 0);
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        

        if (shades.validAge(Integer.valueOf(scan.nextLine()))>18) {
            System.out.println("you can watch the movie " + shades.movieName);
            
        }else{
            System.out.println("abey lavde ");
        }

       


    }
}
