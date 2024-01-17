package part4;

import java.util.Scanner;

public class personforBmi {

    String initialName;
    Double height;
    Double weight;
    
    public personforBmi(String initialName){

        this.height = 0.00;
        this.weight = 0.00;
        this.initialName = initialName;
        
    }
    public String getName(){
        return initialName;
    }

    public void setHeight(Double height){
        this.height = height;
    }
    public void setWeight(Double weight){
        this.weight = weight;
    }
    
    public double BMI(){
        double heightPerHund = height/100;
        return weight/ (heightPerHund*heightPerHund);


    }
    public void setInitialName(String initialName) {
        this.initialName = initialName;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number of persons");

        int i = Integer.valueOf(scan.nextLine());

        for(int j =0; j<i; j++){
            

            System.out.println("what is the name of the person");
            personforBmi person = new personforBmi(scan.nextLine());

            System.out.println("what is the height?");

            person.setHeight(Double.valueOf(scan.nextLine()));

            System.out.println("what is the weight?");

            person.setWeight(Double.valueOf(scan.nextLine()));

            System.out.println("the BMI of " + person.getName() + " is " + person.BMI());



        }




    
       

       

        
    }
}
