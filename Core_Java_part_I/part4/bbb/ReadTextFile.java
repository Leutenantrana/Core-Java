


package part4.bbb;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) {
        try( Scanner scanner = new Scanner (Paths.get("sample.txt"))){
            while (scanner.hasNextLine()) {

                String row = scanner.nextLine();

                System.out.println(row);
                
            }
        }catch(Exception e){
            System.out.println( "Error"  + e.getMessage());
        }
    }
    
}
