package part4;

public class knock {

    public knock(){

    }

    public void sound(){
        System.out.println("who is there?");
    }


    public static void main(String[] args) {
        knock Alex = new knock();

        knock Savvy = new knock();

        Alex.sound();

        Savvy.sound();

    }
}
