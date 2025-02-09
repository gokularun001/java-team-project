package gokul;

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
        long a =10000;
        int b = (int)+a;
       // System.out.println(b);

        int c= 100;
        long d=c;
        //System.out.println(d);
        String s = "Page 1 of 10767878877899878978";
        String result=s.substring(10);
        String[] parts = s.split(" ");
        String number = parts[3];

        System.out.println(number);
    }
}
