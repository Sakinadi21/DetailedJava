package Assignment8;

import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        System.out.println("Have you completed your masters?");
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter input among y/n ");
        ch = input.next().charAt(0);

        System.out.println("Are you fluent in English?");
        input = new Scanner(System.in);
        System.out.println("Enter input among y/n ");
        ch = input.next().charAt(0);

        if (ch=='y' || ch=='y') {
            System.out.println("You are eligible for job interview.");
        }
        else {
            System.out.println("Sorry.You are not eligible for the job interview");
        }
    }
}
