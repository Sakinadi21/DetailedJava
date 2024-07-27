package Iteration;

import java.util.Scanner;

public class Series5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,result=1;

        System.out.println("Enter the last number : ");
        n = input.nextInt();

        for (int i = 1; i <=n ; i=i+1){
            result = result+i ;
        }
        System.out.println();
        System.out.println(result);
    }
}
