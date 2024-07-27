package Random;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 8; // 0 to 10
        System.out.println("Random number = "+randomNumber);


        int randomNumber1 = (int) (Math.random()*100) + 1;
        System.out.println("Random number = "+randomNumber1);
    }
}
