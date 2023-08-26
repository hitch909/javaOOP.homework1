import java.util.ArrayList;

public class Basket extends User {
    private ArrayList<Product> basketArrayList;

    public Basket(String login, ArrayList<Product> basketArrayList) {
        super(login);
        this.basketArrayList = basketArrayList;
    }

    public ArrayList<Product> getBasketArrayList() {
        return basketArrayList;
    }


    public void purchase(ArrayList<Product> basketArrayList, Product product, ArrayList<Product> productArrayList ){
        basketArrayList.add(product);
        for (Product i: basketArrayList) {
            if(basketArrayList.contains(product)){
                productArrayList.remove(product);
            }
        }
    }
    public void remuveProduktBasket(ArrayList<Product> basketArrayList, Product product){
        basketArrayList.remove(product);
    }
    public void showBasket(ArrayList<Product> basketArrayList, User user){
        System.out.println("Покупатель " + user.getLogin() + " Список покупок:  ");
        for (Product i: basketArrayList ) {
            System.out.println(i);
        }
    }
}

