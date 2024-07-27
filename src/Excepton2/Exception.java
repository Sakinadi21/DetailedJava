package Excepton2;

public class Exception extends Throwable {
    public static void main(String[] args) throws ArithmeticException, Exception {
        try{
            int[] a = new int[4];
            a[4] = 10;
        } finally {
            System.out.println("Last line of the program");
        }
    }
}
