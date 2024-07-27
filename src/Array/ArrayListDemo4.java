package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> number1 = new ArrayList<>();

        number1.add(20);
        number1.add(-3);
        number1.add(18);
        number1.add(92);
        number1.add(0);
        number1.add(30);
        number1.add(2);

        System.out.println("before sorting : "+number1);

        Collections.sort(number1);
        System.out.println("after sorting in ascending :"+number1);

        Collections.sort(number1,Collections.reverseOrder());
        System.out.println("after sorting in descending :"+number1);

    }
}
