package String;

public class StringDemo4 {
    public static void main(String[] args) {

        String s1 = "Saki,How are you?";
        System.out.println(s1);

        String s2 = s1.replace('h','n');
        System.out.println(s2);

        String[] s3 = s1.split(" ");
        for (String x : s3){
            System.out.println(x);
        }
    }
}
