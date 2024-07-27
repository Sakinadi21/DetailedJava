package Iteration;

import java.util.Scanner;

public class Series2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;

        System.out.println("Enter the last number : ");
        n = input.nextInt();

        for (int i = 1; i <=n ; i=i+2){
            System.out.println(i+ " ");
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
