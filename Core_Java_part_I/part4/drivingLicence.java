package part4;

import java.util.Scanner;

public class drivingLicence {

    String initialname;
    int age;

    public drivingLicence (String initialName, int age){
        this.initialname = initialName;
        this.age = age;

    }

    public void details(){
        System.out.println(initialname + age);


    }

    public void getLicence(){
        if (age<18) {
            System.out.println("you can get a licence after" + (18-age) + "years") ;


            
        }else{
            System.out.println("your details have been taken ");
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name of the person ");
        System.out.println("enter the age of the person ");



        drivingLicence per1 = new drivingLicence(scan.nextLine(), Integer.valueOf(scan.nextLine()));
        System.out.println("enter the name of the person ");
        System.out.println("enter the age of the person ");


        drivingLicence per2 = new drivingLicence(scan.nextLine(), Integer.valueOf(scan.nextLine()));

        per1.details();

        per1.getLicence();

        per2.details();
        per2.getLicence();

    }

    
}
