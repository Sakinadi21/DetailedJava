package Array;

public class Array4 {
    public static void main(String[] args) {
        String[] names = {"Mashu","Saki","Anis","Sara"};

       /* String[] names = new String[5];
        names[0] = "Mashu";
        names[1] = "Saki";
        names[2] = "Anis";
        names[3] = "Anisa";
        names[4] = "Ana"; */

        for (String x : names){
            System.out.println(x);
        }

        int[] num = {10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        for(int x : num){
            sum = sum+x;
        }
        System.out.println(sum);
    }
}
