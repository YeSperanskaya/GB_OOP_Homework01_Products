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


public class Category {
    /**
     * @apiNote Это переменная содержит категорию товаров
     * @nameCategory наименование категории товаров
     */
    private String nameCategory;
    /**
     * @apiNote Эта переменная содержит массив товаров относящихся к определенной категории
     * @listOfProducts массив товаров относящихся к определенной категории товаров
     */
    private List<Product> listOfProducts;

    public Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Product> getList() {
        return listOfProducts;
    }

    public void setArrayList(ArrayList<Product> arrayList) {
        this.listOfProducts = arrayList;
    }

    /**
     * Создание категории товаров
     * @param nameCategory название категории товаров
     * @param listOfProducts массив товаров в категории
     */
    public Category(String nameCategory, List<Product> listOfProducts) {
        this.nameCategory = nameCategory;
        this.listOfProducts = listOfProducts;
    }


    /**
     * Коректный вывод на печать Названия категории товаров и массива самих товаров
     */
    @Override
    public String toString() {
        return "Категория: " + nameCategory +
                ", товары: " + listOfProducts;
    }





}
