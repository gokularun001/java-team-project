package gokul;

interface  Gokul{
    int age= 21;//final static variables
    static void arun(){       //abstract methods, default method,static method.
        System.out.println("good boy");
    }
    default void vijay(){
        System.out.println("intelligent boy");
    }
    void hulk(int age);
}
interface Ajith extends Gokul {
    int age=25;
    static void kumaran(){
        System.out.println("smart boy");
    }
    default void sudalai(){
        System.out.println("bad boy");
    }
    void rajan(int age);
}
public class DataAbstraction implements Ajith{
    @Override
    public void hulk(int age) {
        System.out.println("gokul");
    }

    @Override
    public void rajan(int age) {
        System.out.println("ajith");
    }
    void thor(){
        System.out.println("God of thunder");
    }

    public static void main(String[] args) {
        DataAbstraction rider = new DataAbstraction();
        rider.vijay();
        rider.sudalai();
        rider.hulk(100);
        rider.rajan(200);
        rider.thor();
        Gokul.arun();
        Ajith.kumaran();
        System.out.println(Gokul.age);
        System.out.println(Ajith.age);
    }
}