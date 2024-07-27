package String;

public class PalindromeDemo {
    public static void main(String[] args) {

        String s1 = "121";

        StringBuffer sb = new StringBuffer(s1);

        String s2 = sb.reverse().toString();

        if(s1.equals(s2))
        {
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a palindrome");
        }

       /* sb.reverse();

        if(s1.equals(sb)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        } */
    }
}
