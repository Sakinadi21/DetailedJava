package Assignment7;

import java.util.Scanner;

public class Assignment7 {

    public static void main(String[] args) {

      System.out.println("Do you love Java?");

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter input among Y/y/N/n ");
        ch = input.next().charAt(0);

        if (ch=='Y' || ch=='y') {
            System.out.println("You are a java lover.");
        }


            else if (ch=='N' || ch=='n'){
                System.out.println("You are not a java lover.");
            }
            else{
                System.out.println("wrong input");
            }

    }
    }

