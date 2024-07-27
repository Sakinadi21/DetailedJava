package String;

public class StringDemo1 {
    public static void main(String[] args) {

        String s1 = "Mashrafi Uddin";
        String s2 = new String("Mashrafi Uddin");

        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        int len = s1.length();
        System.out.println("Length of s1 = "+len);

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Equals");
        } else{
            System.out.println("Not equal");

        }

        boolean con = s1.contains("Uddin");
        System.out.println(con);

        boolean b = s1.isEmpty();
        System.out.println("b = "+b);
    }
}
