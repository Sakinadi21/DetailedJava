package Arithmetic;

public class MathDemo {
    public static void main(String[] args) {

        int x = 4;
        int y = 3;
        int z = -2;

        int max = Math.max(x , y);
        System.out.println("Maximum :"+max);

        int min = Math.min(x , y);
        System.out.println("Minimum :"+min);

        int abs = Math.abs( z);
        System.out.println("Absolute :"+abs);

        double power = Math.pow(x,y);
        System.out.println("x to the power y : "+power);

        int round = Math.round(0.4f);
        System.out.println("Round of 0.4 = "+round);

        double PI = Math.PI;
        System.out.println("PI : "+PI);
    }
}
