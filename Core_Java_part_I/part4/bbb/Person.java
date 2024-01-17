package part4.bbb;

import java.util.ArrayList;
import java.util.Scanner;

import part4.person;

public class Person {

    String name;
    int age;
    int height;
    int weight;

    public Person(String name, int age){
        this.name =name;
        this.height = 0;
        this.weight = 0;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return this.name + " the age is " + age;
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        // Person person = new Person("sagar");

       Scanner scan = new Scanner(System.in);

       while (true) {
        System.out.println("write the name of the show in the format  eg Rick and morty, 30 " );

        

        String input = scan.nextLine();

        if(input.isEmpty()){
            break;
        }

        String [] parts = input.split(",");

        String name = parts[0];

        int duration = Integer.valueOf(parts[1]);

        persons.add(new Person(name, duration));


        
       }

       System.out.println("enter the duration ");

       int durations = Integer.valueOf(scan.nextLine());


       for(Person person : persons){
        
            if ( person.getAge()> durations) {
                System.out.println(person);
                
            }

       }


        

            
         
       
      
      

       



      

      


       

    }
    
}
