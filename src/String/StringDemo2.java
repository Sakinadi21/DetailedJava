package String;

public class StringDemo2{
    public static void main(String[] args) {

            String firstName = "Mashrafi";
            String lastName= "Uddin";

            String fullName = firstName.concat(lastName);
            System.out.println("Full Name = "+fullName);

        String upperName = fullName.toUpperCase();
        System.out.println("Upper Name = "+upperName);

        String lowerName = fullName.toLowerCase();
        System.out.println("Lower Name = "+lowerName);

        boolean b = firstName.startsWith("Mas");
        System.out.println("b = "+b);

        boolean last = lastName.endsWith("ix");
        System.out.println("last = "+last);

        String[] names = {"mashrafi","mashu","sakiba","saki","saku"};
        for(String x : names){
            System.out.println(x);
        }
        System.out.println();
        for(int i = 0; i<3 ; i++){
            System.out.println(names[i]);
        }

    }
}
