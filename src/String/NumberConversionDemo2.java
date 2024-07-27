package String;

import java.util.Scanner;

public class NumberConversionDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.println("Enter any decimal number : ");
        decimal = input.nextInt();

       // int decimal = 15;

        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);

        String octal = Integer.toOctalString(decimal);
        System.out.println(octal);

        String hexadecimal = Integer.toHexString(decimal);
        System.out.println(hexadecimal);


    }
}
