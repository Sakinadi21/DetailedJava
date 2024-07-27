package Iteration;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                continue;
            }

            System.out.println(i);
        }
    }
}