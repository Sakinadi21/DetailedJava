package Arithmetic;

import java.util.Scanner;

public class CircularDemo {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double radius, area;

            System.out.println("Enter radius : ");
            radius = input.nextDouble();


            area = 3.1416 * radius * radius;
            System.out.println("Area of circle :" + area);
        }
}
