package Array;

import java.util.Scanner;

public class DiagoMatrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] [] A = new int [3] [3];
        int sumOfDiagonalElements = 0;
        int sumOfUpperElements = 0;
        int sumOfLowerElements = 0;

        //Matrix input
        for (int row = 0;row <3 ; row++) {
            for (int col = 0; col <3 ;col++){
                A[row] [col] = input.nextInt();
            }
        }
        //diagonal,upper,lower

        for (int row = 0;row <3 ; row++) {
            for (int col = 0; col <3 ;col++){

                if(row==col)
                {
                    sumOfDiagonalElements = sumOfDiagonalElements +  A[row] [col];
                }
                if(row<col)
                {
                    sumOfUpperElements = sumOfUpperElements +  A[row] [col];
                }
                if (row>col)
                {
                    sumOfLowerElements = sumOfLowerElements + A[row] [col];
                }


            }
        }
        System.out.println("Sum of diagonal elements : "+sumOfDiagonalElements);
        System.out.println("\n");

        System.out.println("Sum of upper elements : "+sumOfUpperElements);
        System.out.println("\n");

        System.out.println("Sum of lower elements : "+sumOfLowerElements);
        System.out.println("\n");

    }
}
