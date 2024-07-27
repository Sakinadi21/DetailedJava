package Array;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);

        System.out.println(number);
        System.out.println();
        System.out.println("size = "+number.size());

        //Removing elements
        number.remove(2);
        System.out.println("after removing ArrayList contains : "+number);

        number.removeAll(number);
        System.out.println("After Removing all : "+number);

        number.clear();
        boolean check = number.isEmpty();
        System.out.println("arraylist empty : "+check);

        boolean contain = number.contains(30);
        System.out.println("30 is in the list : "+contain);

        int pos = number.indexOf(40);
        System.out.println("The index of 40 is : "+pos);

        number.set(3,50); //replace
        System.out.println("after setting : "+number);

        int x = number.get(0);
        System.out.println("Index 0 = "+x);
    }
}
