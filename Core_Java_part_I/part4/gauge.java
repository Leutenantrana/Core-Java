package part4;

public class gauge {

    int value = 0;
    public gauge(){

    }
    public boolean full(){
        if (value==5) {
            return true;

            
        }else 
        {
            return false;
        }
    }

    public int value(){
        return value;
    }
    public void decrease(){
        value = value -1;

    }
    public int increase(){
        value = value + 1;
        return value;
    }

    public static void main(String[] args) {
        gauge g = new gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
            }

}

