package part5;

import part4.bbb.Person;

public class healthStation {

    Person person;
    double weight;
    int count;
    

    public healthStation () {

       this.person =null;
       this.weight = 0;
       this.count = 0;




    

    }
    
   
    public void feed(Person person){
        this.person =person;
        this.person.growWeight();
        
    }
     public double weigh(Person person){
        this.person =person;

        this.weight = this.person.getWeight();

        this.count = this.count + 1;


        return this.weight;

        

    }

    public int weighing (){
        return this.count;
    }


    public static void main(String[] args) {
    // example main program for the first section of the exercise

    healthStation childrensHospital = new healthStation();

    Person ethan = new Person("Ethan", 1, 110, 7);
    Person peter = new Person("Peter", 33, 176, 85);

    System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
    System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

    childrensHospital.feed(ethan);
    childrensHospital.feed(ethan);
    childrensHospital.feed(ethan);

    System.out.println("");

    System.out.println(ethan.getName() + " weight: " + childrensHospital.weigh(ethan) + " kilos");
    System.out.println(peter.getName() + " weight: " + childrensHospital.weigh(peter) + " kilos");

    System.out.println("weighings performed: " + childrensHospital.weighing());
}
    
}
