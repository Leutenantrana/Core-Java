package part4;


public class song {

    String naam;
    int sankhya;
    public song(String name , int length ){
        this.naam = name;
        this.sankhya = length;

    }
    public String name(){
        return naam;
    }
    public int sankhya(){
        return sankhya;
    }


    public static void main(String[] args) {
        song song1 = new song("baadal barsa bi choli...saavan ko paani", 120);


        System.out.println("the name of the song is " + song1.name() + "   the length of the song is " + song1.sankhya() ); 
    }
}
