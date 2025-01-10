package kabil;

public class SearchElement {
    public static void main(String[] args){
        int a []= {56,77,8};
        int find = 56;
        for (int i = 0;i<a.length;i++){
            if (a[i]==find){
                find = i;


            }
        }
        if (find != -1){
            System.out.println("element is in index: " + find);
        }else System.out.println("element not found");
    }
}
