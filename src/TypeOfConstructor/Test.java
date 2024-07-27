package TypeOfConstructor;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mashrafi Uddin","Male",1897);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher();
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();//default
    }
}
