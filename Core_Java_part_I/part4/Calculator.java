public class Calculator {
    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Call the add method with parameters
        int sum = calculator.add(5, 3);
        System.out.println("The sum is: " + sum);
    }
}


    
