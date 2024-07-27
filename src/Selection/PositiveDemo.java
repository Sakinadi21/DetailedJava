package Selection;

import java.util.Scanner;

public class PositiveDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any integer");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("Positve");
        }
        else if (num < 0) {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }
}
