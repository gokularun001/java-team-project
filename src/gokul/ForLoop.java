package gokul;

public class ForLoop
{
    public static void main(String[]args){
      /*  for(int a=1; a <= 10; a++){
            System.out.println(a);
        }*/
       /* int[] numbers = {10,20,30,40};    // number[0]=10,number[1]=20,number[2]=30,number[3]=40;
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }*/
        int sum=0;
        for(int i=1;i<=5;i++){    //sum=0+1=1;sum=1+2=3;sum=3+3=6;sum=6+4=10;sum=10+5=15;
            sum+=i;
        }
        System.out.println("sum:"+sum);
    }
}
