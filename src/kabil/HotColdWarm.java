package kabil;

public class HotColdWarm extends GopiAmnt1{
    public static void main(String[] args){

        int degree = 45;
        if (degree >= 30){
            System.out.println("Hot");
        } else if (degree <= 15 ) {
            System.out.println("Cold");
        } else if (degree <= 30 && degree >= 15) {
            System.out.println("warm");
        }
    }
}
