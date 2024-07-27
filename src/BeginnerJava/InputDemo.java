package BeginnerJava;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter any number");
        number=input.nextInt();
        System.out.println("Number = " + number);

        String name;
        System.out.println("Enter any name");
      name=input.next();//print only 1st part
        System.out.println("Name = " + name);


        /*String myman;
        myman=input.nextLine();//print full name
        System.out.println("Welcome" +myman);*/
    }
}
