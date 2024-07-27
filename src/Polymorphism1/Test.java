package Polymorphism1;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.display();

        p = new Teacher();
        p.display();


        Student s = new Student();
        p.display();
    }
}
