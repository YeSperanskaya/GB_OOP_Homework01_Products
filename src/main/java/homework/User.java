package homework;

import java.util.Arrays;

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

    public User(String login, String password, Basket basket) {
        this.login = login;
        this.password = password;
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Ассортимент товара пользователя " + login +
                ", с паролем: " + password + " "
                 + basket +
                '}';
    }





    public static User createMagazine() {
        Product product001 = new Product("мармелад", 100.5, 3, 3);
        Product product002 = new Product("помидор", 56.9, 4, 3);
        Product product003 = new Product("хлеб", 26.3, 5, 3);
        Product product004 = new Product("Сникерс", 56, 5, 3);
        Product product005 = new Product("колбаса", 560, 5, 3);
        Product product006 = new Product("огурец", 205.6, 5, 3);

        Category vegetablesCategory = new Category("овощи", Arrays.asList(product002, product006));
        Category sweetCategory = new Category("сладкое", Arrays.asList(product001, product004));
        Category baceryCategory = new Category("хлебобулочные изделия", Arrays.asList(product003));
        Basket magazineBasket = new Basket(Arrays.asList(product001, product002,product003,product004,product005,product006));
        User magazine = new User("магазин", "qwerty", magazineBasket);
        return magazine;
    }



    // и объект класса баскет

    // тут должны быть пользоватеоли и магазин
    // сделать подкласс магазин в котором будут состоять все продукты и из которого они будут убираться
}
