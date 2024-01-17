package part4;

public class Whistle {

    String sound;
    public Whistle(String sound){
        this.sound = sound;
    }

    public void sound(){
        System.out.println( sound);
    }

    public static void main(String[] args) {
        Whistle duckWhistle = new Whistle("quack");

        Whistle cat = new Whistle("myoon");


        duckWhistle.sound();
        cat.sound();
        
    }
}
