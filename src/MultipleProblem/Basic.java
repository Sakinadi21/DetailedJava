package MultipleProblem;

public class Basic {
    /*
        A
      foo()
      /   \
      B    C
    foo() foo()
      \   /
        D    But both classes are in same level with same priority . If we want to use foo() method that
        from D class object leads to ambiguity . This is called diamond problem.

        Public class A{
        void foo(){
        }
        }
        Public class B extends A{
         void foo(){
        }
        }
        Public class C extends A{
         void foo(){
        }
        }
        Public class D extends B,C{
        --------------
        }
        Public class Test{
        public static void main(String [] args){
         D ob = new D ();
         ob.foo(); // ambiguity marks here error
         }
         }
     */
}
