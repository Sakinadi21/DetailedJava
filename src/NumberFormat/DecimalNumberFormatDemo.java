package NumberFormat;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {
    public static void main(String[] args) {
        DecimalFormat ob = new DecimalFormat("0.000");
        double x = 2.98254600;
        System.out.println("x = " + ob.format(x));

    }
}
