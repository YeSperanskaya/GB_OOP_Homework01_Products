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


    public Category(String nameCategory, List<Product> arrayListOfProducts) {
        this.nameCategory = nameCategory;
        this.listOfProducts = arrayListOfProducts;
    }

    @Override
    public String toString() {
        return "Категория: " + nameCategory + '\'' +
                ", входящие товары: " + listOfProducts +
                '}';
    }


    // мне надо составить список товаров их все засовываю в один эррей лист и обзываю одинаково.
    // надо список объектов  и их засунуть в один эррей лист
    // фишка в том что они потом, мол добавить к значению эррей листов такие-то 
}
