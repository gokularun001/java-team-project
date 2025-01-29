package gokul;

import java.util.Scanner;
public class Repetition
{
    public static void main(String[]args){
        Scanner gokul=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int  n=gokul.nextInt();
        System.out.println("Enter elements:");
        int a[]=new int[n];
        for(int x=0; x<n; x++){
            a[x]=gokul.nextInt();
        }
        System.out.println("Enter the element count:");
        int target=gokul.nextInt();
        int count=0;
        for(int x=0; x<n; x++){
            if(a[x]==target){
                count++;
            }
            if(count>0){
                System.out.println("Element" + target + "appears" + count + "times in the array");
            }
            else{
                System.out.println("Element" + target + "is not founded");
            }
        }
    }
}
