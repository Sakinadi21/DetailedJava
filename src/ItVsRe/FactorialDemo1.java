package ItVsRe;

public class FactorialDemo1 {
    int fact(int n){
        if(n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
/*Recursion:
Use selection structure ( for ,while , do while )
Terminates when base case is satisfied.
It's slow.
Code is smaller.
 */
