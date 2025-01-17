package ajithk;

import java.util.Scanner;

public class MyPraticS {
    public static void main(String[] args) {
        Scanner ajith = new Scanner(System.in);
        System.out.println("ajith please enter your number");
        int number = ajith.nextInt();
        if (number %2==0) {
            System.out.println("even number");
        }
                else {
                    System.out.println("odd number");
        }
                System.out.println("enter the mark");
                int mark = ajith.nextInt();
                if (mark >=35){
                    System.out.println("pass");
                }
                else {
                    System.out.println("faile");
                }

                //switch case
        System.out.println("enter the month");
        int month = ajith.nextInt();
                switch (month){
                    case 1:
                        System.out.println("januvary");break;
                    case 2:
                        System.out.println("febravary");break;
                    case 3:
                        System.out.println("marchi");break;
                    case 4:
                        System.out.println("aprill");break;
                    case 5:
                        System.out.println("may");break;
                    case 6:
                        System.out.println("june");break;
                    case 7:
                        System.out.println("july");break;
                    case 8:
                        System.out.println("august");break;
                    case 9:
                        System.out.println("september");break;
                    case 10:
                        System.out.println("october");break;
                    case 11:
                        System.out.println("november");break;
                    case 12:
                        System.out.println("december");break;
                    default:
                        System.out.println("not moth");
                }
    }
}

