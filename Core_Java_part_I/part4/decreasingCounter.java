package part4;

public class decreasingCounter {

    int counterr;
    int initialCount;
    
    public decreasingCounter(int counter){
        initialCount = counter;
        this.counterr = counter;

    }

    public void reset(){
        counterr = initialCount; 
        System.out.println(counterr);
    }

    public void decrement(){

        while (counterr> 0) {
             counterr = counterr - 1; 

            if( counterr % 2 == 0){
                System.out.println("haha haha haha hahah ahahaha");
            }else{
                System.out.println(counterr);
            }
            

        }

        System.out.println("the value can't be decremented further");

        
       



        System.out.println(counterr);
    }


    public static void main(String[] args) {
        decreasingCounter instance1 = new decreasingCounter(1000);
        instance1.decrement();

        instance1.reset();
    }
}
