package Assignment5;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Enter any person age");
        age = input.nextInt();

        if (age > 18 || age==18) {
            System.out.println("Voter");
        }

        else{
            System.out.println("invalid vote");
        }
    }
}
