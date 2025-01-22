package kabil;

public class MethodPractice {
    int getnumber(){
        return 100;
    }
    void getvalue(String name,int age){
        System.out.println(name + age);
    }
    void getaddition(int a,int b){
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MethodPractice kabil = new MethodPractice();
        System.out.println(kabil.getnumber());
        kabil.getvalue("kabil",25);
        kabil.getaddition(5,6);
    }

}