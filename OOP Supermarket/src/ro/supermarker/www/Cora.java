package ro.supermarker.www;

public class Cora implements Supermarker {


    private int i;
    private ProductInStock[] products;

    public Cora(){
        this.products = new ProductInStock[3];
        this.i = 0;
    }
    @Override
    public void addStock(Product product, double addedValue) {
        ProductInStock productInStock = new ProductInStock(product,addedValue);
        this.products[i] = productInStock;
        i++;
    }

    @Override
    public void deleteStock(int id, double quantity) {
        for(int j = 0; j< 3; j++ ){
            if(products[j].getProduct().getId()== id){
                products[j] = null;
            }
        }

    }

    @Override
    public Product[] listProducts(String category) {
        Product[] result = new Product[3];
        for (ProductInStock product: products) {
           if(product != null && product.getProduct().getCategory().equals(category)) {
               System.out.println(product);
               result[i++] =
           }


        }
        return new Product[0];
    }
}
