package Static6;

public class StaticBlock {
    static int id;
    static String name;
    static{
        id = 101;
        name="Mashu";
    }
    static void display(){
        System.out.println("id : "+id);
        System.out.println("Name : "+name);
    }
}
