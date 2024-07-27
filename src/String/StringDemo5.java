package String;

public class StringDemo5 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Sakiba");

        System.out.println(sb);

        sb.append(" Belal ");
        sb.append(25);

        System.out.println(sb);

        sb.delete(0,6);
        System.out.println(sb);

        sb.setLength(5);
        System.out.println(sb);
    }
}
