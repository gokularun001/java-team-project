package gokul;

public class While
{
    public static void main(String[]args){
       /* int a=1;
        while(a<=10){    //when the condition false it will stop
            System.out.println(a);
            a++;
        }*/
        /*int a=0;      //a=1;odd number
        while(a<=10){
            System.out.println(a);
            a+=2;
        }*/
        int a=5;
        while(a<=10){
            if(a%2==0) {
                System.out.println(a);
            }
            a++;
        }
    }
}
