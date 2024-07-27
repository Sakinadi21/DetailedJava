package BasicEncapsulation2;



public class EncapTest {
    public static void main(String[] args) {
    Person p1 = new Person();
    p1.setName("Mashu");
    System.out.println(p1.getName());

       /*
         p1.name="Mashu";
         p1.age=20;
         Private data will be hidden from other classes and they can only be accessed through
         the methods of their current class. this known as data hiding.
        */

    }
}
