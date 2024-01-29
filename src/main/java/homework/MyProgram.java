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

import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        // создать продукты сразу с количеством, засовывая их сразу через лист в категории
        // баскет через то как я выбирала какую команду выбрать в итоговой задаче по джава
        //юзер логин и пароль вообще фигня и к нему баскед присобачить
        // он пишет название продукта и количество, программа скачет по массиву продуктов по названию если такое находит то добавляет в корзину чувака и отнимает из кассы магазина

        Product product001 = new Product("мармелад", 100.5, 3, 2);
        Product product002 = new Product("помидор", 56.9, 4, 35);
        Product product003 = new Product("хлеб", 26.3, 5, 45);
        Product product004 = new Product("Сникерс", 56, 5, 45);
        Product product005 = new Product("колбаса", 560, 5, 34);
        Product product006 = new Product("огурец", 205.6, 5, 2);

        Category vegetablesCategory = new Category("овощи", Arrays.asList(product002, product006));
        Category sweetCategory = new Category("сладкое", Arrays.asList(product001, product004));
        Category baceryCategory = new Category("хлебобулочные изделия", Arrays.asList(product003));
        Basket magazineBasket = new Basket(Arrays.asList(vegetablesCategory, sweetCategory, baceryCategory));



        System.out.println(vegetablesCategory);
        System.out.println(sweetCategory);
        System.out.println(baceryCategory);

    }




}
