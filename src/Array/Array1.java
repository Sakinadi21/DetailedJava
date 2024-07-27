package Array;

public class Array1 {
    public static void main(String[] args) {

        int [] number = new int[6];

        number[0]=10;
        number[1]=10;
        number[2]=10;
        number[3]=10;
        number[4]=10;
        number[5]=10;

        int sum = number[0] + number [1] + number[2] + number[3] + number[4] ;
        System.out.println("sum = "+sum);

        int len = number.length;
        System.out.println("Array size = "+len);
    }
}
