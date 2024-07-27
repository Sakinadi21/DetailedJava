package ReadFile;


import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        try {
            File file = new File("C:/Users/DELL/Documents/student.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID : " + id + " Name: " + name);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
