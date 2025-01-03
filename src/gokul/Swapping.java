package gokul;

public class Swapping
{
    public static void main(String[]args){
       /* int a= 5,b= 10;
        //swapping without using a third variable
        a = a+b; //a = 5+10, a=15;
        b = a-b; //b = 15-10, b=5;
        a = a-b; //a = 15-5, a=10;
        System.out.println("After swapping : a ="+a+",b ="+b);*/
       /* int a = 5, b = 10;
        a = a*b; //a becomes 50
        b = a/b; //b becomes 5
        a = a/b; //a becomes 10
        System.out.println("After swapping : a="+a+",b="+b);*/
        int a = 5, b = 10; //XOR ^ symbol
        a = a^b;   // a = 0101^1010=1111
        b = a^b;   // b = 1111^1010=0101
        a = a^b;   // a = 1111^0101=1010
        System.out.println("After swapping :a="+a+",b="+b);
    }
}
