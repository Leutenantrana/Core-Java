package part4;

import java.util.Scanner;

public class table {

    int numbre;



    public table(int number){
        this.numbre = number;
    }

    public void multiplyBy(){
        int multiply;
        int index = 10;
        for (int j= 1; j<= index; j++){
            System.out.println( this.numbre + " X " +  j  + " = " + this.numbre*j);
        }
      

       


    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" enter the number of which you want the table of ");

        int index = Integer.valueOf(scan.nextLine());


        for(int j=1; j<=index; j++){
             table multiplyBythree = new table(j);
             multiplyBythree.multiplyBy();

              System.out.println("   ");

        }
       
       

        

        

    }
    
}
