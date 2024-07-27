package ReturningValue;

public class Test {
    public static void main(String[] args) {
        ReturningValueDemo obj1 = new ReturningValueDemo();
        int result= obj1.square(5);
        System.out.println("square of 5 = "+ result);
        System.out.println("or");
        System.out.println("square of 5 = "+obj1.square(5) );

        ReturningValueDemo obj2 = new ReturningValueDemo();
        System.out.println("square of 5 = "+ obj2.square(6));
    }
}
