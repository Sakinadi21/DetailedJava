package Hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String>customer = new HashMap<Integer,String>();

        customer.put(101,"Mashrafi");
        customer.put(102,"Sakiba");
        customer.put(103,"Nadiha");
        customer.put(104,"Mashra");

        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
        System.out.println(customer.get(104));
    }
}
