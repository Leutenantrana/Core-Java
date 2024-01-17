package part4.c;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;


public class readsFile {

    public static void main(String[] args) {

        
        System.out.println("enter the file name");

        Scanner scan = new Scanner(System.in);

        <ArrayList <String> row = new ArrayList<>();

      
       try (Scanner scanner = new Scanner(Paths.get(scan.nextLine()))){

           
        
            
            
                // we print the line that we read
            while (scanner.hasNext()) {
                row.add(scanner.nextLine());

                
            }   
           
               

            
            
           
           
           
            System.out.println("write the name of the person");

            Scanner scannerr = new Scanner(System.in);

          

       }catch (Exception e){
        System.out.println("Error:"  + e.getMessage());
       }

   


    }
    
}
