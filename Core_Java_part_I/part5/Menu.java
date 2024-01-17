package part5;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String>meals;
    public Menu(){
        this.meals = new ArrayList<>();
    }

    public void addItems( String itemString){
        if (!(this.meals.contains(itemString))) {
            this.meals.add(itemString);
            
        }


    }
    public void removeItem(String itemString){
        if (this.meals.contains(itemString)) {
            this.meals.remove(itemString);
            
        }
    }
    public void clearMeals(){
        this.meals.clear();
    }

    public void printMeals(){

        if(this.meals.size()>0){
             System.out.println("Items in the Meal are:");
            for (String item : meals) {
                System.out.println(item);
            }

       
        }else{
            System.out.println("there is no item in the list");
        }


        
    }


    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItems("chicken");
        menu.addItems("aloo parantha");
        menu.addItems("rash malai");
        menu.addItems("paneer");

        menu.printMeals();


        menu.clearMeals();

        menu.printMeals();


        

    }
    
}
