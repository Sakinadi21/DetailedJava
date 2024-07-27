package Abstraction1;

public abstract class MobileUser {
    void call(){ //non-abstract
        System.out.println("Call method");
    }
    abstract void sendMessage();
}
