package gokul;

import java.util.Scanner;
public class ArrayReverseOrder
{
    public static void main(String[]args){
        Scanner gokul=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=gokul.nextInt();
        System.out.println("Enter the elements:");
        int a[]=new int[n];
        for(int x=0; x<n; x++){
            a[x]=gokul.nextInt();
        }
        System.out.println("Array number in reverse order:");
        for(int x=n-1; x >= 0; x--){
            System.out.println(a[x] + "");
        }

    }
}
