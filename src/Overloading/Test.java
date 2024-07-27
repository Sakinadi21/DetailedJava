package Overloading;

public class Test {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();

        Teacher teacher2 = new Teacher("Mashrafi Uddin","Male");
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher("Mashrafi Uddin","Male",19733);

        teacher3.displayInformation();

    }
}
