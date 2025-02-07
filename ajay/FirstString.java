package ajay;

public class FirstString {
    public static void main(String[] args) {
        String a="showing 1 to 10 of 18922 (190ppages)";
        int b =a.indexOf("(")+1;
        int c= a.indexOf("pages")-1;
        String ajith =a.substring(b,c).trim();
        System.out.println(ajith);
    }
}
