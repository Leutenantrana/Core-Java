package part4;

public class debt {

    double initialBalance;
    double initialInterestRate;

    public debt ( double initialBalance, double initialInterestRate){
        this.initialBalance = initialBalance;
        this.initialInterestRate = initialInterestRate;

    }

    public double waitOneYear( int year){
         int duration = year;
         int years = 0;

        while (years < duration) {
            double interest = (initialBalance*initialInterestRate)/100;

            initialBalance =  initialBalance + interest;
           
            years = years + 1;
        }
  

        return initialBalance; 

       
    }
    public void showBalance(){
         System.out.println(initialBalance);

    }

    public double returnBal(){
        return initialBalance;

    }
    public String toString(){
        return "the balance after 5 year is" + this.waitOneYear(10);
    }


    public static void main(String[] args) {
        debt morDebt = new debt(100000.00, 2.22);

        debt morgage = new debt(50000, 5.5);

        morgage.waitOneYear(10);


        System.out.println(morDebt);




      


      
       

        
        System.out.println("the account balance in the second account is   " + morgage.returnBal() );
        

    }
    
}
