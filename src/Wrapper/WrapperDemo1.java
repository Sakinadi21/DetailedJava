package Wrapper;

public class WrapperDemo1 {
    public static void main(String[] args) {


        //object -> primitive data type
        Double d = new Double(10.25);
        System.out.println("d = "+d);

        double e = d; //d.doubleValue()  unboxing
        System.out.println(" e = "+e);

    }
}
