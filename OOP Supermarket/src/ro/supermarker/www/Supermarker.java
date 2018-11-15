package ro.supermarker.www;

public interface  Supermarker {

    void addStock(Product product, double adaos);

    void deleteStock(int id, double quantity);

    Product[] listProducts(String category);
}
