package ro.supermarker.www;

import static ro.supermarker.www.CommonStrings.UNIT_OF_MEASURE_KG;

public class Main {


    public static void main(String[] args) {
        //Supermarket side
        Supermarker supermarker = new Cora();

        //id,unitOfMesure,price,quantity,category
        Product bananas = new Banana(1, UNIT_OF_MEASURE_KG,3,100,"fruits");
        Product apple = new Apple(2,"kg",3,100,"fruits");
        //product,quantity, adauos comercial
        supermarker.addStock(bananas,30);
        supermarker.addStock(apple,30);

        //id si quantity
        supermarker.deleteStock(1,50);


        //client side

        Product[] products = supermarker.listProducts("fruits");
        Cart cart = new Cart();
        cart.addProducts(products[0],1);
    }
}
