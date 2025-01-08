package kabil;

public class ArrayPractices {
    public static void main(String[] args) {
        int[] a = {554574, 200, 300, 400}; //memory extends according to the value we give
        for (int i = 0; i <= a.length - 1; i++) {

            System.out.println(a[i]);
        }
        String[] name = new String[2];//array fixed memory
        name[0] = "kabil";
        name[1] = "ajay";
        for (int b = 0; b < name.length; b++) {

            System.out.println(name[b]);
        }

    }
}
