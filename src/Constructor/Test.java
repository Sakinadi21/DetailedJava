package Constructor;


public class Test {
    public static void main(String[] args) {

       Teacher teacher1 = new Teacher("Mashrafi", "Male", 1914); //object declare

        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Sakiba","Female",19730); //object declare
        teacher2.displayInformation();
    }
}
/*
Constructor is a special type of method that is used to initialize the object.
Constructor hase the same name as that of class it belongs.
It has no return type not even void.
it is called automatically.
Default constructor (no parameter), parameterized constructor.
 */
