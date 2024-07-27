package Bitwise;

public class BitwiseOperator {
    public static void main(String[] args) {

        int a =32;
        int b =12;

        int c;

        c = a&b; //and
        System.out.println("a & b :"+c);

        c = a|b; //or
        System.out.println("a | b :"+c);

        c = a^b; //xor
        System.out.println("a ^ b :"+c);


        c=a>>3; //a right shift 3 // a ke 2 diye 3 bar bhag
        System.out.println("a >> b :"+c);

        c=a<<3; //a left shift 3 // a ke 2 diye 3 bar guon
        System.out.println("a << b :"+c);


    }
}
