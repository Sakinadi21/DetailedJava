package Recursion;

public class FactorialTest {
    public static void main(String[] args) {

        FactorialDemo ob = new FactorialDemo();
        int result = ob.fact(5);
        System.out.println("Factorial of 5 : "+result);

        result = ob.fact(4);
        System.out.println("Factorial of 4 : "+result);
    }
}
