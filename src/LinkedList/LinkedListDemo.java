package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>countryNames = new LinkedList<String>();

        countryNames.add("Bangladesh");
        countryNames.add("Brazil");
        countryNames.add("Belgium");
        countryNames.add("Britain");
        countryNames.add("Afghanistan");
        countryNames.add("Africa");
        countryNames.add("Pakistan");
        countryNames.add(5,"Australia");
        countryNames.add("Nepal");
        countryNames.addFirst("Saudi Arabia");
        countryNames.addLast("Japan");

        // countryNames.remove("Japan");
       // countryNames.remove(7);

        countryNames.removeFirst();
        countryNames.removeLast();

       // System.out.println(countryNames);

        for(String country : countryNames){
            System.out.println(country);
        }

        System.out.println("Size of the linked list :"+countryNames.size());
        System.out.println("The linked list :"+countryNames);
        System.out.println("First element : "+countryNames.getFirst());
        System.out.println("Last element : "+countryNames.getLast());
        countryNames.clear();
        System.out.println(countryNames);
    }
}
