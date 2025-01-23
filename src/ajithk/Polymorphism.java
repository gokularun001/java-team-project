package ajithk;

public class Polymorphism {
int a ;
    void method() {
        System.out.println("hi guys");
    }

    void method (String ajay){
        System.out.println(ajay);
    }

    public static void main(String[] args) {
        Polymorphism ajay=new Polymorphism();
        ajay.method("hi makaley");

    }
}