package kabil;

public class TestArray {
    public static void main(String[] args) {
        int[] kab = {12, 45, 56, 34};
        int search = 56;
        for (int i = 0; i < kab.length; i++)
            if (search == kab[i]) {

                System.out.println("the element "+search+" is"+" exist in index "+i);
            }
            else{
                System.out.println("doesnt exist");


        }
    }
}
