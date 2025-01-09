package kabil;

public class FindLargestNumberArray {
    public static void main(String[] args) {
        int []a= {11,12,12,14};
        int lar = a[0];
        for (int i =0;i< a.length;i++){
            if (a[i]> lar){
                lar = a[i];
            }

        }
        System.out.println(lar);

    }
}
