package part4;
import java.util.Scanner;


public class statistic {

    int count;
    int sum1;
    int sum2;

    public statistic(){
        this.sum1= 0;
        this.sum2 = 0;

    }
    public void addNumber(int number){

        int j =number;
        if(j % 2 == 0){
             this.sum1 = this.sum1 + number;
        }else{
            this.sum2 = this.sum2 + number;
        }
       
        count = count + 1;

        
    }
    public int getSumEvenNum(){
        return sum1;
    }
    public int getSumOddNum(){
        return sum2;
    }
    public int getCount(){
        return count;
    }


    public static void main(String[] args) {
        statistic case1 = new statistic();
        Scanner scan = new Scanner(System.in );



        System.out.println("enter the number you want to add : ");



        case1.addNumber(Integer.valueOf(scan.nextLine()));
        case1.addNumber(Integer.valueOf(scan.nextLine()));
        
        case1.addNumber(Integer.valueOf(scan.nextLine()));
        case1.addNumber(Integer.valueOf(scan.nextLine()));
        
        case1.addNumber(Integer.valueOf(scan.nextLine()));
        case1.addNumber(Integer.valueOf(scan.nextLine()));

       System.out.println("the number of times number added is " +  case1.getCount());

       System.out.println("the sum is even number is " + case1.getSumEvenNum() + "the sum of odd number is " + case1.getSumOddNum());
    }
    
}
