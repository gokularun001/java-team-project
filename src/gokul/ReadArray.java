package gokul;

import java.util.Scanner;
public class ReadArray
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
        System.out.println("You entered:");
        for(int x=0; x<n; x++){
            System.out.println(a[x]+"");
        }
    }
}
