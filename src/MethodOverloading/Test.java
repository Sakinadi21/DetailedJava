package MethodOverloading;

public class Test {
    public static void main(String[] args) {
        Overload ov1 = new Overload();
        ov1.add();
        ov1.add(5.5,10.5);
        ov1.add(2,3,5);
    }
}
