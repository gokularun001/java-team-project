package gokul;

public class ReverseInteger
{
    public static void main(String[]args){
        int i=1234;
        int reverse=0;
        int digit=0;
        while(i>0){
            digit = i%10;
            reverse=reverse*10+digit;
            i/=10; //i=i/10;
        }
        System.out.println(reverse);
    }
}
