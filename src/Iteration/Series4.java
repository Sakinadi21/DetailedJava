package Iteration;

import java.util.Scanner;

public class Series4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,sum=0;

        System.out.println("Enter the last number : ");
        n = input.nextInt();

        for (int i = 1; i <=n ; i=i+1){
            System.out.println(i+ "X" + i +" ");
            sum = sum + i*i;
        }
        System.out.println();
        System.out.println(sum);
    }
}

