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

import java.util.List;

public class Basket{
    private List<Product> listBasket;

    private double sumOfProducts;

    public Basket(List<Product> listBasket) {
        this.listBasket = listBasket;
        System.out.println("Сумма корзины составляет " + summ());
    }



    public double summ() {
        for (Product elem : listBasket) {
            sumOfProducts += (elem.getCount()*elem.getPrice());
        }
        return sumOfProducts;
    }

    public List<Product> getListBasket() {
        return listBasket;
    }

    public void setListBasket(List<Product> listBasket) {
        this.listBasket = listBasket;
    }

    @Override
    public String toString() {
        return "Список товаров в корзине: " + listBasket + "\n" +
                "общая сумма товаров: " + summ();
    }







}
