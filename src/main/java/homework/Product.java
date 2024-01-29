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

public class Product {
    private String name;

    private double price;
    private int rating;
    private int count;





    /**
     * @apiNote Создание класса товар
     * @param name наименование товара
     * @param price цена товара в рублях
     * @param rating рейтинг товара  в диапазоне от 0 до 5

     */
    public Product(String name, double price, int rating, int count) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.count = count;

    }

    /**
     * Наименвоание товара
     * @name наименвоание товара класса Product
     */
    public String getName() {
        return name;
    }

    /**
     * @price цена товара класса Product
     */
    public double getPrice() {
        return price;
    }

    /**
     * @count количество товара класса Product
     */
    public int getCount() {
        return count;
    }

    /**
     * Изменить количество товара
     * @param count количество товара класса Product
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * Корректный вывод на экран наименования товара, рейтинрга, цены, количества
     */
    @Override
    public String toString() {
        return name + " (цена: " + price + ", рейтинг: " + rating + ", количество: " + count + ")";
    }
}
