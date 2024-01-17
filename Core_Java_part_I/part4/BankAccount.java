package part4;
import java.util.Scanner;

public class BankAccount {

    String accountNumber;
    Double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    void asc(){
        System.out.println("the account holder name " + accountNumber);
        System.out.println("the account balance is "+ balance);
    }
    public void deposit( double amount){
        if ( amount>0) {
            balance = balance + amount;
            System.out.println("the new account balance is " + balance);

            
        }else{
            System.out.println("no amount is added to the account");
        }

         
    }
    public void withdraw(double amount){
        if (amount >0 && balance>amount){
            balance = balance - amount;
        }else{
            System.out.println("account balance is less than the amount entered");
        }

    }


    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("sagar", 12.23);

        bankAccount.asc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the amount you want to deposit");

        bankAccount.deposit(Double.valueOf(scanner.nextLine()));

         System.out.println("enter the amount you want to withdraw");

        bankAccount.withdraw(Double.valueOf(scanner.nextLine()));





        
    }
    
}
