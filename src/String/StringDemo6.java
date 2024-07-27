package String;

public class StringDemo6 {
    public static void main(String[] args) {

        StringBuilder str= new StringBuilder("Mashrafi");
        System.out.println("str = "+str);


        str.append(" Uddin");
        str.append( 13);
        str.append( 5.2003);
        System.out.println("str = "+str);

        str.delete(1,5);
        System.out.println(str);
    }
}
