package Assignment3;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int id;
        System.out.println("Enter any id");
        id=input.nextInt();
        System.out.println("id = " + id);

        String title;
        System.out.println("Enter any title");
        title=input.next();
        System.out.println("title= " + title);

        double price;
        System.out.println("Enter price");
        price=input.nextDouble();
        System.out.println("price= " + price);

        String description;
        System.out.println("Enter description");
        description=input.next();
        System.out.println("description= " + description);

        String category;
        System.out.println("Enter any category");
        category=input.next();
        System.out.println("category= " + category);

    }
}
