/**
 * Домашнее задание на закрепление:
 *
 * 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
 * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
 * 3)Создать класс Basket, содержащий массив купленных товаров.
 * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
 * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
 * 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
 *
 * Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре
 *
 * Формат сдачи:
 * Ссылка на гитхаб проект
 * Подписать фамилию и номер группы
 */


package homework;

import java.util.HashMap;
import java.util.List;

public class Basket{
    private HashMap<Product, Integer> hashMApBasket;
    private int countOfProducts;

    private double sumOfProducts;

    public Basket(Product prod, int countOfProducts) {
        HashMap<Product, Integer> hashMap = new HashMap<>();
        hashMap.put(prod,countOfProducts);
        this.hashMApBasket = hashMap;
    }
    public Basket() {
        HashMap<Product, Integer> hashMap = new HashMap<>();
        this.hashMApBasket = hashMap;
    }


    public HashMap<Product, Integer> getHashMApBasket() {
        return hashMApBasket;
    }


    public int getCountOfProducts() {
        return countOfProducts;
    }

    @Override
    public String toString() {
        return
                "Список товаров в корзине: " + hashMApBasket + "\n";
                //"общая сумма товаров: " + summ();
    }

    public void put(Product prod, int countOfProducts) {
        this.hashMApBasket.put(prod,countOfProducts);
    }





}
