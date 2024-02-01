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


import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class MyProgram {

    public static void main(String[] args) {
        //User magazine = createMagazine();
        Product product001 = new Product("мармелад", 100.5, 3);
        Product product002 = new Product("помидор", 56.9, 4);
        Product product003 = new Product("хлеб", 26.3, 5);
        Product product004 = new Product("Сникерс", 56, 5);
        Product product005 = new Product("колбаса", 560, 5);
        Product product006 = new Product("огурец", 205.6, 5);

        //добавила категории
        System.out.println("В нашем магазине содержатся следующие товары: ");
        Category sweetCategory = new Category("Сладкое", Arrays.asList(product001, product004));
        Category vegetablesCategory = new Category("овощи", Arrays.asList(product002, product006));
        Category breadCategory = new Category("хлебобулочные изделия", Arrays.asList(product003));
        Category meatCtegory = new Category("мясные изделия", Arrays.asList(product005));
        System.out.println(sweetCategory + "\n" + vegetablesCategory + "\n" + breadCategory + "\n" + meatCtegory);

        Basket magazineBasket = new Basket (product001, 3);
        magazineBasket.put(product002,3);
        magazineBasket.put(product003, 3);
        magazineBasket.put(product004,3);
        magazineBasket.put(product005,3);
        magazineBasket.put(product006,3);
        User magazine = new User("magazine", "qwerty", magazineBasket);

        User user1 = new User("user", "sesef", new Basket(product001, 1));
        //System.out.println(user1);
        //magazine.buy(user1);
        User user2 = new User("fdgd", "rgdr", new Basket(product004, 234234));
        //magazine.buy(user2);
        User user3 = new User("rfgdfg", "gfdgdfg", new Basket(product001, -3));
        magazine.buy(user3);



    }

    /**
     * Этот метод создает полностью магазин с ассортиментом из которого уже будет все вычитаться
     * @return возвращает весь ассортимент магазина
     */




}
