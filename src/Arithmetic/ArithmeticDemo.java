package Arithmetic;

import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int num1, num2,result;
        System.out.println("Enter first number");
        num1=input.nextInt();
        System.out.println("Enter second number");
        num2=input.nextInt();
       /* num1= 20;
        num2= 10; */
        result= num1+num2;
        System.out.println("Sum: "+ result);

        result= num1-num2;
        System.out.println("Sub: "+ result);

        result= num1*num2;
        System.out.println("Multiplication: "+ result);

        result= num1/num2;
        System.out.println("Div: "+ result);

        result= num1%num2;
        System.out.println("Remainder: "+ result);

    }
}
