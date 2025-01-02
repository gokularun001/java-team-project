package gokul;

public class ForLoop
{
    public static void main(String[]args){
      /*  for(int a=1; a <= 10; a++){
            System.out.println(a);
        }*/
       /* int[] numbers = {10,20,30,40};
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }*/
        int sum=0;
        for(int i=1;i<=5;i++){
            sum+=i;
        }
        System.out.println("sum:"+sum);
    }
}
