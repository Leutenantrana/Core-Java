package part4;

public class product {
    
    String initialName;
    int initialPrice;
    int initialQuantity; 


    public product(String initialName, int initialPrice, int initialQuantity){
        this.initialName = initialName;
        this.initialPrice = initialPrice;this.initialName = initialName;
    this.initialPrice = initialPrice;
    this.initialQuantity = initialQuantity;
        this.initialQuantity = initialQuantity;

    }

    void printProduct(){
        System.out.println(initialName + " price : "+ initialPrice +" " + "  quantity:" + initialQuantity);

    }


    public static void main(String[] args) {
        
        product prod1 = new product("sugar", 10 , 10);

        product prod2 = new product("salt", 14, 2);

        product prod3 = new product("coffee", 100, 2);

        prod1.printProduct();
        prod2.printProduct();
        prod3.printProduct();
    }
     
}
