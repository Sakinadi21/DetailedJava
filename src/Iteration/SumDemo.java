package Iteration;

import java.util.Scanner;

public class SumDemo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum=0;
        int m,n;

        System.out.println("Enter initial number : ");
        m = input.nextInt();


        System.out.println("Enter final number : ");
        n = input.nextInt();

        for(int i = m; i <= n; i++) {

            sum = sum + i;
            System.out.println(" "+i);
        }
        System.out.println();
        System.out.println("The sum is :"+sum);
    }
}
