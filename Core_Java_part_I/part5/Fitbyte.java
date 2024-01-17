package part5;
import java.lang.Math; 

public class Fitbyte {

    int age;
    double restingHeartRate;
    double maximumHeartRate;
    
    

    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate =restingHeartRate;
        
       

    }

    


    
    public double targetHeartRate(double percentageOfMaximum){

        double maxHeartRate = 206.3 - (0.711 * age);
         

        double val = ((maxHeartRate - restingHeartRate) * (percentageOfMaximum)) + restingHeartRate;

       

        return val;
    }


    public static void main(String[] args) {
        Fitbyte assistant = new Fitbyte(30, 60);

        double percentage = 0.5;
        

        while (percentage < 1.0) {
            double target = assistant.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;
        }
    }


    
}
