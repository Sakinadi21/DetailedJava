package Abstraction1;

public class Test {
    public static void main(String[] args) {
        MobileUser mu;
        mu = new Mashu(); //call reference
        mu.sendMessage();
        mu.call();

        mu = new Saku();
        mu.sendMessage();
    }
}
