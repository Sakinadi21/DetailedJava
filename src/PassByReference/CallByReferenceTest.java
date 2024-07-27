package PassByReference;

public class CallByReferenceTest {
    public static void main(String[] args) {
/*
Stack memory
r1
r2
 */
        CallByReference r1 = new CallByReference();
        r1.name="Mashrafi";
        System.out.println("before calling :"+r1.name);
/*
Heap memory
Object of type : PassByReference
Attribute:Mashrafi
then it's change to
Attribute: Sakiba
 */
        r1.change(r1);
        System.out.println("after calling :"+r1.name);
    }
}
