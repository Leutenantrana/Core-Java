package part5;

public class clockk {

    public static void main(String[] args) {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        if (seconds<10) {
            System.out.print(0);
            
        }
        System.out.print(seconds);

        System.out.print(":");

        if (minutes<10) {
            System.out.print(0);
            
        }
        System.out.print(minutes);

        System.out.print(":");

        if (hours<10){
            System.out.print(0);
        }
        System.out.print(hours);


        seconds = seconds +1;


        if(seconds>59){
            seconds = 0;
            minutes = minutes+1;
        }

        if (minutes>59) {
            minutes = 0;
            hours = hours +1;
            
        }
        if (hours>23) {
            hours = 0;
            
        }

    }
    
}
