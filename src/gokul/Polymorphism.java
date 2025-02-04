package gokul;

public class Polymorphism {
    int sum(int a,int b, int c){    //void sum(int a, float b, double c){
        System.out.println(a+b+c); //      System.out.println(a+b+c);
        return a+b+c;              //}
    }
    int sum(int a, int b){        //void sum(float a,double b){
        System.out.println(a+b);  //     System.out.println(a+b);
        return a+b;               //}
    }
    int sum(int a,int b,int c,int d){   //void sum(long a, double b, float c, int d){
        System.out.println(a+b+c+d);    //     System.out.println(a+b+c+d);
        return a+b+c+d;                 //}
    }
    public static void main(String[]args){
        Polymorphism sasuke= new Polymorphism();
        int result=sasuke.sum(10,20);
        System.out.println("The result :"+result);
    }
}
