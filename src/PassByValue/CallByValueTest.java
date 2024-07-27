package PassByValue;

public class CallByValueTest {
    public static void main(String[] args) {

        CallByValue call1 = new CallByValue();
        int x=10; //primitive data ,eigula stack memory te save kora hoi
        System.out.println("x before call : "+x);

        call1.change(x);//x actual parameter
        System.out.println("x after call : "+x);
        //formal value change hbe but actual value change hbe na
    }
}
/*
If we call a method by passing-a-value (primitive data) then it is known as call-by-value
the value is copied to a method parameter.
changes to that formal parameter doesn't affect the actual parameter.
In call-by-value original value doesn't change.
 */