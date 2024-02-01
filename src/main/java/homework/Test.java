package homework;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Product product001 = new Product("мармелад", 100.5, 3);
        Product product002 = new Product("помидор", 56.9, 4);
        Product product003 = new Product("хлеб", 26.3, 5);

/**
 * @param map1 магазин
 * @param map2 клиент
 */
        HashMap<Product, Integer> map1 = new HashMap<>();
        map1.put(product001, 3);
        map1.put(product002, 3);
        map1.put(product003, 3);

        HashMap<Product, Integer> map2 = new HashMap<>();
        map2.put(product001, 1);
        map2.put(product002, 1);
        int countOfClient;
        int oldCountOfMagazine;
        int newCountInMagazine;
        for (Product prod : map1.keySet()) {
            //System.out.println(prod);
            if (map2.keySet().contains(prod)) {
                oldCountOfMagazine = map1.get(prod);
                newCountInMagazine = oldCountOfMagazine - map2.get(prod);
                System.out.println("новое количество в магазине " + newCountInMagazine);
                map1.put(prod, newCountInMagazine);
                System.out.println(prod);
                System.out.println("ив получилось");
            }
        }
        System.out.println("конец цикла");
        System.out.println(map1);
        //System.out.println(map2);

    }
}
