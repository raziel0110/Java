package ro.supermarker.www;

public class ProductInStock {

    private Product product;
    private double addedValue;

    public ProductInStock(Product product, double addedValue) {
        this.product = product;
        this.addedValue = addedValue;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getAddedValue() {
        return addedValue;
    }

    public void setAddedValue(double addedValue) {
        this.addedValue = addedValue;
    }

    @Override
    public String toString() {
        return "ProductInStock{" +
                "product=" + product +
                ", addedValue=" + addedValue +
                '}';
    }
}
