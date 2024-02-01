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
    /**
     * @hashMApBasket карта в формате ХэшМэп, содержащаяся в Корзине
     */
    private HashMap<Product, Integer> hashMApBasket;


    private double sumOfProducts;

    /**
     * @apiNote Создание корзины путем добавления продукта
     * @param prod наименование продукта
     * @param countOfProducts количество создаваемого продукта
     */
    public Basket(Product prod, int countOfProducts) {
        HashMap<Product, Integer> hashMap = new HashMap<>();
        hashMap.put(prod,countOfProducts);
        this.hashMApBasket = hashMap;
    }

    /**
     * @apiNote Создание пустой корзины
     */
    public Basket() {
        HashMap<Product, Integer> hashMap = new HashMap<>();
        this.hashMApBasket = hashMap;
    }

    /**
     * @apiNote Содержимое корзины
     * @return Возврат корзины в формате ХэшМэп
     */
    public HashMap<Product, Integer> getHashMApBasket() {
        return hashMApBasket;
    }


    @Override
    public String toString() {
        return
                "Список товаров в корзине: " + hashMApBasket + "\n";
                //"общая сумма товаров: " + summ();
    }

    /**
     * Добавить товар в корзину
     * @param prod наименование товара
     * @param countOfProducts количество товара
     */
    public void put(Product prod, int countOfProducts) {
        this.hashMApBasket.put(prod,countOfProducts);
    }

    public boolean basketIsEmpty() {
        return hashMApBasket.isEmpty();
    }



}
