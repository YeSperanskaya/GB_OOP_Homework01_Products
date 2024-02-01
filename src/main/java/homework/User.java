package homework;

import java.util.Arrays;
import java.util.HashMap;

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

public class User {
    private String login;
    private String password;
    private Basket basket;

    /**
     * @apiNote Создание пользователя Магазин (используя логин, пароль, заполненную корзину для магазина)
     * @param login логин
     * @param password пароль
     * @param basket содержимое корзины
     */
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    /**
     * Создание пользователя ФЛ или ЮЛ (используя логин, пароль)
     * @param login логин пользователя
     * @param password пароль пользователя
     */
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }


    /**
     * Просмотр содержимого корзины
     * @return содержимое корзины
     */
    public Basket getBasket() {
        return basket;
    }



    /**
     * @apiNote Функция добавляющая элементы в корзину пользователю
     * @param prod название товара
     * @param count количество товара
     */
    public void addBasketUser(Product prod, int count) {
        basket.put(prod, count);
    }

    /**
     * @apiNote Измененый формат распечатки toString
     * @return
     */
    @Override
    public String toString() {
        return "Ассортимент товара пользователя " + login +
                ", с паролем: ***********"
                + basket.getHashMApBasket() +
                '}';
    }





    // и объект класса баскет

    // тут должны быть пользоватеоли и магазин
    // сделать подкласс магазин в котором будут состоять все продукты и из которого они будут убираться
}
