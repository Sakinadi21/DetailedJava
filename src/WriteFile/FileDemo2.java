package WriteFile;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;



public class FileDemo2 {
    public static void main(String[] args) {
        String id, name;
try{
        Formatter formatter = new Formatter("C:/Users/DELL/Documents/student.txt");
        Scanner input = new Scanner(System.in);
        System.out.println("How many students: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.println("Enter student id and name : ");
            id = input.next();
            name = input.next();
            formatter.format("%s %s \r\n", id, name);
        }
        formatter.close();
    }catch (FileNotFoundException e){
    System.out.println(e);
}

}
}