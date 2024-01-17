package part4;


import java.util.Scanner;

public class person {
    
    String name;
    int age;
    String surname;

    public person(String initialName, int age){
        this.name = initialName;
        this.age = age;
        this.surname = " default"; 

    }


    public void details(){
        System.out.println(" the name of person is  " + name + "the age of person is " + age  + "  " + "the full name of person is " + name + surname);
    }

    public void growOlder(int increaseInAge){
        int old = increaseInAge;
        age = age + old;
        System.out.println(" the age os person now is " + age);
    }
    public static void main(String[] args) {
        person person1 = new person("kishor", 22);

        person1.details();

        Scanner scan = new Scanner(System.in);


        System.out.println("how many years you want to add?");

        

        person1.growOlder(Integer.valueOf(scan.nextLine()));


    }
}
