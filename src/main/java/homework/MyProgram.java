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


import java.util.HashMap;

public class MyProgram {

    public static void main(String[] args) {
        Product product001 = new Product("мармелад", 100.5, 3);
        User magazine = createMagazine();
        magazine.getBasket();
        User ivanov = new User("Ivanov", "324234");
        System.out.println(ivanov);
        // надо человеку добавлять элемент в корзину
        ivanov.addBasketUser(product001,3);
        System.out.println(ivanov);



    }

    /**
     * Этот метод создает полностью магазин с ассортиментом из которого уже будет все вычитаться
     * @return возвращает весь ассортимент магазина
     */
    public static User createMagazine() {
        Product product001 = new Product("мармелад", 100.5, 3);
        Product product002 = new Product("помидор", 56.9, 4);
        Product product003 = new Product("хлеб", 26.3, 5);
        Product product004 = new Product("Сникерс", 56, 5);
        Product product005 = new Product("колбаса", 560, 5);
        Product product006 = new Product("огурец", 205.6, 5);
        Basket magazineBasket = new Basket (product001, 3);
        magazineBasket.put(product002,3);
        magazineBasket.put(product003, 3);
        magazineBasket.put(product004,3);
        magazineBasket.put(product005,3);
        magazineBasket.put(product006,3);
        User magazine = new User("magazine", "qwerty", magazineBasket);
        System.out.println(magazine);
        return magazine;
    }



}
