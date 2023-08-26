import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> productArrayList;

    public Category(String name, ArrayList<Product> productArrayList) {
        this.name = name;
        this.productArrayList = productArrayList;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProductArrayList() {
        return productArrayList;
    }

    public void addProduct(ArrayList<Product> productArrayList, Product product) {
        productArrayList.add(product);
    }

    void showProductArrayList(ArrayList<Product> productArrayList) {
        System.out.println("список товаров в магазине");
        for (Product i : productArrayList) {
            System.out.println(i);
        }
    }

    public void removeProduct(ArrayList<Product> productArrayList, Product product) {
        productArrayList.remove(product);
    }
}
