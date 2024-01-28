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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyProgram {
    public static void main(String[] args) {
        Product product001 = new Product("marmelad", 100.5, 3);
        Product product002 = new Product("tomate", 56.9, 4);
        Product product003 = new Product("bread", 26.3, 5);
        Product product004 = new Product("snikers", 56, 5);
        Product product005 = new Product("sausage", 560, 5);
        Product product006 = new Product("cucmber", 205.6, 5);
        //System.out.println(product001);
        addedInArrayList(product002);
        addedInArrayList(product006);
        Category vegetablesCategory = new Category("овощи");
        Category sweetCategory = new Category("sweetCategory");
        System.out.println(vegetablesCategory);
        System.out.println(vegetablesCategory);
    }

    public static void addedInArrayList(Product elem) {

    }


}
