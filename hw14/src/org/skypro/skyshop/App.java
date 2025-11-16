package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {

    public static void main(String[] args) {
        Product phone = new Product("Телефон ", 75000);
        Product laptop = new Product("Ноутбук ", 80000);
        Product phone2 = new Product("Телефон ", 70000);
        Product tablet = new Product("Планшет", 70000);
        Product headphones = new Product("Наушники", 5000);
        Product mouse = new Product("Мышь", 1500);
        ProductBasket basket1 = new ProductBasket();
        System.out.println("1. Добавление продукта в корзину:");
        basket1.addProduct(phone);
        basket1.addProduct(laptop);
        basket1.printContents();
        System.out.println("2. Добавление продуктов в переполненную корзину:");
        ProductBasket basket2 = new ProductBasket();
        basket2.addProduct(phone2);
        basket2.addProduct(tablet);
        basket2.addProduct(headphones);
        basket2.addProduct(mouse);
        basket2.addProduct(phone);
        basket2.addProduct(phone2);
        basket2.printContents();
        System.out.println("3. Печать содержимого корзины с несколькими товарами:");
        basket1.printContents();
        System.out.println("4. Получение стоимости корзины с несколькими товарами:");
        int totalPrice = basket1.getTotalPrice();
        System.out.println("Общая стоимость корзины: " + totalPrice + " рублей");
        System.out.println("5/6. Поиск товаров, которые есть и нет в корзине:");
        boolean searchPhone = basket1.containsProduct("Телефон ");
        boolean searchMouse = basket1.containsProduct("Мышь ");
        System.out.println(searchPhone);
        System.out.println(searchMouse);
        System.out.println("7. Очистка корзины");
        basket1.clearBasket();
        basket1.printContents();
        System.out.println("9. Получение стоимости пустой корзины:");
        totalPrice = basket1.getTotalPrice();
        System.out.println("Общая стоимость корзины: " + totalPrice + " рублей");
        System.out.println("10. Поиск товара по имени в пустой корзине:");
        boolean searchPhone2 = basket1.containsProduct("Телефон");
        System.out.println(searchPhone2);
    }
}



