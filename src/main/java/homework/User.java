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
     * @param login    логин
     * @param password пароль
     * @param basket   содержимое корзины
     * @apiNote Создание пользователя Магазин (используя логин, пароль, заполненную корзину для магазина)
     */
    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    /**
     * Создание пользователя ФЛ или ЮЛ (используя логин, пароль)
     *
     * @param login    логин пользователя
     * @param password пароль пользователя
     */
    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }


    /**
     * Просмотр содержимого корзины
     *
     * @return содержимое корзины
     */
    public Basket getBasket() {
        return basket;
    }

    public String getLogin() {
        return login;
    }

    /**
     * @param prod  название товара
     * @param count количество товара
     * @apiNote Функция добавляющая элементы в корзину пользователю
     */
    public void addBasketUser(Product prod, int count) {
        basket.put(prod, count);
    }

    /**
     * @return
     * @apiNote Измененый формат распечатки toString
     */
    @Override
    public String toString() {
        return "Ассортимент товара пользователя " + login +
                ", с паролем: ***********"
                + basket.getHashMApBasket() +
                '}';
    }

    /**
     * @apiNote функция покупки на кассе
     * Покупатель выбирает товары в корзину, которые хочет приобрести и указывает их количество,
     * Данная функцуия проверяет наличие товара в магазине, выводит оставшееся количество в магазине и количество приобретенных товаров покупателем
     * @param buyer покупатель класса User
     */
    public void buy(User buyer) {
        HashMap<Product, Integer> hashMagazine = this.getBasket().getHashMApBasket();
        HashMap<Product, Integer> hashBuyer = buyer.getBasket().getHashMApBasket();
        //тест
        System.out.println("ассортимент в магазине в начале: ");
        System.out.println(hashMagazine);
        System.out.println("выбор клиента");
        System.out.println(hashBuyer);

        int countOfClient;
        int oldCountOfMagazine;
        int newCountInMagazine;
        System.out.println("start");
        for (Product prod : hashMagazine.keySet()) {
            //System.out.println(prod);
            if (hashBuyer.keySet().contains(prod)) {
                countOfClient = hashBuyer.get(prod);
                oldCountOfMagazine = hashMagazine.get(prod);
                if (countOfClient > oldCountOfMagazine) {
                    System.out.println("В нашем магазине нет достаточного количества " + prod);
                    countOfClient = oldCountOfMagazine;
                    newCountInMagazine = 0;
                    hashBuyer.put(prod, countOfClient);
                    hashMagazine.put(prod, newCountInMagazine);
                } else if (countOfClient < 0) {
                    hashBuyer.remove(prod);
                } else {
                    newCountInMagazine = oldCountOfMagazine - countOfClient;
                    hashMagazine.put(prod, newCountInMagazine);
                }
            }
        }
        System.out.println("ассортимент в магазине в конце: ");
        System.out.println(hashMagazine);
        if (hashBuyer.isEmpty()) {
            System.out.println("Клиент " + buyer.getLogin() + " ничего не купил!");
        } else {
            System.out.println("Клиент " + buyer.getLogin() + " купил:");
            System.out.println(hashBuyer);
        }

    }
}



    // и объект класса баскет

    // тут должны быть пользоватеоли и магазин
    // сделать подкласс магазин в котором будут состоять все продукты и из которого они будут убираться

