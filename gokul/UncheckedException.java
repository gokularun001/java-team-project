package gokul;

public class UncheckedException {
    public static void main(String[] args) {
        Object a[]={100,2.14,30000,40.583,"hero",true};
        System.out.println("Lets check infinite value will run in java");//my own thought
        try {
            System.out.println(35 / 0);
        }
        catch (Exception e){
            System.out.println("Infinite value will not run in java");
        }
        finally {
            System.out.println("Hence proved");
        }
    }
}
