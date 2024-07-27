package TypeCasting1;

public class Test {
    public static void main(String[] args) {
        Person p = new Teacher();//upcasting
        p.display();

        Teacher t = (Teacher) new Person();//downcasting
        t.display();
    }
}
