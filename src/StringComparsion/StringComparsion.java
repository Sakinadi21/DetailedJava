package StringComparsion;

public class StringComparsion {
    public static void main(String[] args) {

        String password1 = "mashu123";
        String password2 = "mashu123";
        String password3 = new String("mashu123");
        String password4 = new String("mashu123");

        System.out.println(password1==password2);
        System.out.println(password1==password3);
        System.out.println(password3==password4);
    }
}
