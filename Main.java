/*
1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Стол", 5.500, 5.4);
        Product product2 = new Product("Стул", 2.340, 7.2);
        Product product3 = new Product("Кресло", 6.750, 5.5);
        Product product4 = new Product("Кровать", 12.500, 2.5);
        Product product5 = new Product("Диван", 9.990, 7.6);
        Product product6 = new Product("Табурет", 1.500, 8.8);
        Product product7 = new Product("Комод", 8.300, 3.4);

        ArrayList<Product> productArrayList = new ArrayList<>();
        Category category = new Category("Список товаров", productArrayList);

        User user = new User("спартак", "CxGh1847MkI" );

        ArrayList<Product> basketArrayList = new ArrayList<>();
        Basket basket1 = new Basket(user.getLogin(), basketArrayList);

        category.addProduct(productArrayList, product1);
        category.addProduct(productArrayList, product2);
        category.addProduct(productArrayList, product3);
        category.addProduct(productArrayList, product4);
        category.addProduct(productArrayList, product5);
        category.addProduct(productArrayList, product6);
        category.addProduct(productArrayList, product7);


        category.showProductArrayList(productArrayList);
        System.out.println("------------------------------------------------------------");

        basket1.purchase(basketArrayList, product3, productArrayList);
        basket1.purchase(basketArrayList, product1, productArrayList);

        basket1.showBasket(basketArrayList, user);
        System.out.println("------------------------------------------------------------");
        category.showProductArrayList(productArrayList);
        System.out.println("-------------------------------------------------------------");
    }
}

