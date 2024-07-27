package PassByReference;

public class CallByReference {
    String name;
    void change (CallByReference r2){
        r2.name="Sakiba";
    }
}
/*
If we call a method by passing-a-reference type data (object,String etc.) then it is known as
call-by-reference.
changes to that formal parameter does affect the actual parameter.
In call-by-reference original value gets change.
 */
