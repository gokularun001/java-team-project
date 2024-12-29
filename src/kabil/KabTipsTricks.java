package kabil;
public class KabTipsTricks {
public static void main(String[] args) {
    //to find area of a rectangle
    int a = 20;
    int b = 20;
    System.out.println(a * b);

    //to find average of 5 numbers
    int c = 10;
    int d = 10;
    int e = 10;
    int f = 10;
    int g = 10;
    System.out.println((c + d + e + f + g)/5 );

    // check positive or negative number
    int num1 = 0;
    if (num1 > 0){
        System.out.println("the number is positive");

    } else if (num1 < 0){
        System.out.println("the number is negative");
    }
    else {
        System.out.println("the number is zero");
    }

    // check even or odd number
    int num2 = 27;
    if (num2 %2 == 0){
        System.out.println("the given number is even");
    }
    else {
        System.out.println("the given number is odd");
    }
    //degree = hot if above 30 , cold if below 15 , warm if between 15 to 30
    int degree = 45;
    if (degree >= 30){
        System.out.println("Hot");
    } else if (degree <= 15 ) {
        System.out.println("Cold");
    } else if (degree <= 30 && degree >= 15) {
        System.out.println("warm");
    }
    // pass /or /fail
    int maths = 40;
    if (maths >= 40){
        System.out.println("kabil is pass");
    }else if (maths < 40){
            System.out.println("kabil is fail");
    }
//  how to find the largest of 2 numbers
    int number1 = 25;
    int number2 = 30;
    if (number1 > number2){
        System.out.println("the largest number is number1");
    }
        else if (number2 > number1){
            System.out.println("the largest number is number2");
        }

}
}


