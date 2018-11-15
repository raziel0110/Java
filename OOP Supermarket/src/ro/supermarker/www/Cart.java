package ro.supermarker.www;

public class Cart {


        private ProductInCart[] products;
        int index;

        public Cart(ProductInCart products, ){
            this.products = new ProductInCart[3];
            this.index = 0;
        }

        public void addProduct(Product product, double quantity){
            products[index] = new ProductInCart(product,quantity);
            index++;
        }

        public void printStatus(){
            double sum = 0;

            for (ProductInCart productInCart: products) {
                if(productInCart != null){
                    Product product = productInCart.getProduct();
                }
            }
        }

}
