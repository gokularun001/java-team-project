package gokul;

import java.util.Scanner;
public class LinearSearch
{
    public static void main(String[]args){
        Scanner gokul = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int i = gokul.nextInt();
        System.out.println("Enter the elements:");
        int a[] =new int[i];
        for(int x=0; x<i; x++){
            a[x]=gokul.nextInt();
        }
        System.out.println("Enter the element to search:");
        int target = gokul.nextInt();
        for(int x =0;x<i;x++){
            if(a[x]==target){
                System.out.println("Element founded:"+x);
            }
            else{
                System.out.println("Element not founded");
            }
        }
    }
}
