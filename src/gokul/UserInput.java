package gokul;

import java.util.Scanner;

public class UserInput
{
    public static void main(String[]args){
        Scanner gokul = new Scanner(System.in);
        int a = gokul.nextInt();
        int b = gokul.nextInt();
        System.out.println(a+b);
    }
}