package Class;

public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(); //object declare
        teacher1.name="Mashrafi";
        teacher1.gender="male";
        teacher1.phone=19148;

        System.out.println("Name : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("Phone : "+teacher1.phone);

        System.out.println("\n \n");

        Teacher teacher2 = new Teacher(); //object declare
        teacher2.name="Sakiba";
        teacher2.gender="Female";
        teacher2.phone=19348;

        System.out.println("Name : "+teacher2.name);
        System.out.println("Gender : "+teacher2.gender);
        System.out.println("Phone : "+teacher2.phone);
    }
}
