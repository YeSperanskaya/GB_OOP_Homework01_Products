package homework;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Product product001 = new Product("мармелад", 100.5, 3);
        Product product002 = new Product("помидор", 56.9, 4);
        Product product003 = new Product("хлеб", 26.3, 5);


        HashMap<Product, Integer> map1 = new HashMap<>();
        map1.put(product001, 3);
        map1.put(product002, 3);
        map1.put(product003, 3);

        HashMap<Product, Integer> map2 = new HashMap<>();
        map2.put(product001, 1);
        map2.put(product002, 1);

        for (Product prod : map1.keySet()) {
            //System.out.println(prod);
            if (map2.keySet().contains(prod)) {

                System.out.println(prod);
                System.out.println("ив получилось");
            }
        }
        System.out.println("конец цикла");

    }
}
