package StringComparsion;

public class StringComparsion2 {
    public static void main(String[] args) {

        String password1 = "mashu123";
        String password2 = "mashu123";
        String password3 = new String("mashu123");
        String password4 = new String("mashu123");
        String password5 = "Mashu123";

        System.out.println(password1.equalsIgnoreCase(password2));
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
    }
}
