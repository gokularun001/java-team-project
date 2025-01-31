package gokul;

public class Practice1 {
    public static void main(String[]args){
        int a[]={10,20,30,40};
        int find=a[0];

        for(int i=0;i<a.length;i++){
            if(a[i]>find){
                find=a[i];
            }
        }
        System.out.println("The largest number is:"+find);
    }
}
