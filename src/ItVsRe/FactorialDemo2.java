package ItVsRe;

public class FactorialDemo2 {
    public static void main(String[] args) {
        int num = 5 , fact =1 ;
        for( int i = 1; i <= num; i++){
            fact = fact +i;
        }
        System.out.println(fact);
    }
}
/*Iteration:
Use repetition structure ( for ,while , do while )
Terminates when continuation condition fails.
It's fast
Code is bigger.
 */