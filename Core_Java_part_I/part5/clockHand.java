package part5;

import part4.song;

public class clockHand {
    private int value;
    private int limit;

    public clockHand(int limit){
        this.value = 0;
        this.limit = limit;
    }

    public int value(){
        return this.value;
    }

    public int advance(){
        this.value =this.value +1;
        if (this.value>this.limit) {
            this.value = 0;
            
        }
        return this.value;

    }
    

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }

        return "" + this.value;
    }
    
    // public static void main(String[] args) {
    //     clockHand hours = new clockHand(23);

       
    //     clockHand minutes = new clockHand(59);
    //     clockHand seconds = new clockHand(59);


    //     while (true) {
    //         // 1. Printing the time
    //         System.out.println(hours + ":" + minutes + ":" + seconds);
        
    //         // 2. Advancing the second hand
    //         seconds.advance();
        
    //         // 3. Advancing the other hands when required
    //         if (seconds.value() == 0) {
    //             minutes.advance();
        
    //             if (minutes.value() == 0) {
    //                 hours.advance();
    //             }
    //         }
    //     }
    // }

    

    // public static void main(String[] args) {
    //     clock c1 = new clock();

    //     while (true) {
    //         System.out.println(c1);
    //         c1.advance();
            
    //     }
    // }

    
    public static void main(String[] args) {
        timer t1 = new timer();

        while (true) {

            System.out.println(t1);
            t1.advance();
            
        }

        
    }
       
    
        
    

    


}    
//  class clock {
//      private clockHand hours;
//         private clockHand minutes;
//         private clockHand seconds;


//         public clock(){
//             this.hours = new clockHand(23);
//             this.minutes = new clockHand(59);
//             this.seconds = new clockHand(59);
//         }

//         public void advance(){

//             this.seconds.advance();
//             if (this.seconds.value() == 0) {

//                 this.minutes.advance();

//                 if (this.minutes.value() == 0) {
//                     this.hours.advance();
                    
//                 }

                
//             }
            
//         }
//         public String toString(){
//                return hours + ": " + minutes + " " + seconds ;
//         }

        
// }

class timer {
    private clockHand hundrethClockHand;
    private clockHand seconds;

    public timer(){
        this.hundrethClockHand = new clockHand(100);
        this.seconds = new clockHand(60);
    }

    public void advance(){
        this.hundrethClockHand.advance();

        if (this.hundrethClockHand.value() == 0) {
            this.seconds.advance();

            
                
            
            
        }


    }

    public String toString(){
        return hundrethClockHand + "  " + seconds;
    }
}



   




