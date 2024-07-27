package Iteration;

import java.util.Scanner;

public class Series3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n,sum=0;

        System.out.println("Enter the last number : ");
        n = input.nextDouble();

        for (double i = 1.5; i <=n ; i=i+2){
            System.out.println(i+ " ");
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
