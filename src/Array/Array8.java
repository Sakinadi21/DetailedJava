package Array;

import java.util.Arrays;

public class Array8 {
    public static void main(String[] args) {

        int[] number = {10,-3,18,5,25};
        Arrays.sort(number);

        System.out.println("Ascending : ");
        for (int i = 0;i<5;i++) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        System.out.println("Descending : ");
        for (int i = 4;i>=0;i--) {
            System.out.print(" "+number[i]);
        }
        System.out.println();
        String[]  names = {"Mashu","Saku","Niloy","Anis"};
        Arrays.sort(names);

        for (int i=0; i < 4; i++) {
            System.out.print(names[i]+ " ");
        }
        System.out.println();

        for (int i=3; i>= 0; i++) {
            System.out.print(names[i]+ " ");
        }
    }
}
