package Selection;

import java.util.Scanner;

public class CapitalDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter: ");
        ch = input.next().charAt(0);

        if (ch>='a' && ch<='z') {
            System.out.println("Small letter");
        }
        else if (ch>='A' && ch<='Z'){
            System.out.println("Capital letter");
        }
        else{
            System.out.println("Not a letter");
        }
    }
}
