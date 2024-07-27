package Final1;

public class University {
    final String UNIVERSITY_NAME = "OU";
     final int fees; //blank final variable..eiktere constructor us krte hoi
    static final int id; //static blank final variable...eiketre static use krte hbe
    University(){
        fees =3000;
    }

    static {
        id=12;
    }

    void display(){
        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
    }
}
