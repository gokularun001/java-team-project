package kabil;

public class ArrayPractices {
    public static void main(String[] args) {
        int[] a = {554574, 200, 300, 400}; //memory extends according to the value we give
        for (int i = 0; i <= a.length - 1; i++) {

            System.out.println(a[i]);
        }
        String[]name = new String[5];
        name[0]= "vijay";
        name[1]= "vijay";
        name[2]= "kabil";
        name[3]= "vijay";
        name[4]= "vijay";
        for (int i=0;i< name.length;i++) {
            System.out.println(name[i]);
        }
    }
}
