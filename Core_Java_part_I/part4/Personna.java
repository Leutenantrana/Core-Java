package part4;

public class Personna {
    String name;
    String surname;

    public Personna(String name, String surname){
        this.name = name;
        this.surname = surname;
        
    }

    public String toString(){
        return "my name is " + name + " ," + name +" " + surname;
    }



    public static void main(String[] args) {
        Personna per1 = new Personna("Devender", "sharma");
        System.out.println( per1);
    }
}
