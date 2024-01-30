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
       User magazine = createMagazine();
       createBasketOfUser(magazine);

       //System.out.println(magazine);
        //basketOfUser(magazine);




        // создать продукты сразу с количеством, засовывая их сразу через лист в категории
        // баскет через то как я выбирала какую команду выбрать в итоговой задаче по джава
        //юзер логин и пароль вообще фигня и к нему баскед присобачить
        // он пишет название продукта и количество, программа скачет по массиву продуктов по названию если такое находит то добавляет в корзину чувака и отнимает из кассы магазина


       //System.out.println(magazine);


   }






    public static void createUser(String password, String login, User magazine) {
        createBasketOfUser(magazine);
    }

    public static void createBasketOfUser(User magazine) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сейчас вам будет предложен на выбор ассортимент магазина, вам нужно указать количество товара, которое вы хотите добавить в корзину");
        HashMap <Product, Integer> forUserBasket = new HashMap<>();
        forUserBasket.entrySet();


        
    }
/**
    public static void basketOfUser(User magazine) {
        List<Product> listUserProduct = new ArrayList<Product>();
        List<Product> listMagazineProduct = magazine.getBasket().getListBasket();
        int countOfProductUser;
        int newCountInMagazine;
        int oldCountInMagazine;
        Scanner sc = new Scanner(System.in);
        System.out.println("Сейчас вам будет предложен на выбор ассортимент магазина, вам нужно указать количество товара, которое вы хотите добавить в корзину");

        for (Product elem : listMagazineProduct) {
            System.out.println(elem);
            countOfProductUser = sc.nextInt();
            oldCountInMagazine = elem.getCount();
            if (countOfProductUser <= oldCountInMagazine) {
                newCountInMagazine = oldCountInMagazine - countOfProductUser;
                System.out.println(newCountInMagazine);
                elem.setCount(newCountInMagazine);
                listUserProduct.add(elem);
                for (Product product : listUserProduct) {
                    if (product.equals(elem)) {
                        product.setCount(countOfProductUser);
                        System.out.println(countOfProductUser);
                    }
                }
            } else {
                System.out.println("В нашем магазине нет такого количества нужного вам товара, у нас на складе имеется только " + elem.getCount());
            }
            // тут должен быть механизм добавления новой цифры количества товара в магазин (с проверкой можно ли вообще столько купить)
            //и тут добавление этого продукта с указанной цифрой в лист, в конце этот лист

        }
        sc.close();
        System.out.println("вся корзина");
        System.out.println(listUserProduct);
        System.out.println("весь магазин");
        System.out.println(magazine);
        //return Basket(listOfProduct);
    }

// убрать из продукта вообще количество
    // создать корзину в ней ввести эту переменную и вместе с переменной сделать количество

    //Basket <Product, Integer> bask = new Basket(Product product01, int count);
 */

public static User createMagazine() {
    Product product001 = new Product("мармелад", 100.5, 3);
    Product product002 = new Product("помидор", 56.9, 4);
    Product product003 = new Product("хлеб", 26.3, 5);
    Product product004 = new Product("Сникерс", 56, 5);
    Product product005 = new Product("колбаса", 560, 5);
    Product product006 = new Product("огурец", 205.6, 5);

    Category vegetablesCategory = new Category("овощи", Arrays.asList(product002, product006));
    Category sweetCategory = new Category("сладкое", Arrays.asList(product001, product004));
    Category baceryCategory = new Category("хлебобулочные изделия", Arrays.asList(product003));
    //Basket magazineBasket = new Basket(Arrays.asList(product001, product002,product003,product004,product005,product006));
    HashMap<Product, Integer> bask = new HashMap<>();
    bask.put(product001, 3);
    bask.put(product002, 3);
    bask.put(product003, 3);
    bask.put(product004, 3);
    bask.put(product005, 3);
    bask.put(product006, 3);
    System.out.println(bask);
    Basket magazineBasket = new Basket (bask);
    System.out.println(magazineBasket);
    User magazine = new User("магазин", "qwerty", magazineBasket);
    //System.out.println(magazine);
    return magazine;
}



}
