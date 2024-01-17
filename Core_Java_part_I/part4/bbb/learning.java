package part4.bbb;

import java.util.ArrayList;

public class learning {

    public static void main(String[] args) {
        ArrayList <String> names = new ArrayList<>();
        String name = "Sagar";
        names.add(name);

        names.add("sadhana");
        names.add("krish");
        names.add("manju");
        names.add("anmol");

        System.out.println(names);


        System.out.println(names.get(1));


        for( String namesss : names){
            System.out.println(namesss);
        }

        int index;

        for(index = 0;index<names.size(); index++){
            System.out.println(names.get(index));
        }


        
    }
    

    


}
