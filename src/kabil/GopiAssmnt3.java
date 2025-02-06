package kabil;

public class GopiAssmnt3 {
    public static void main(String[] args) {
        String s = "Showing 1 to 10 of 18922 (190 pages)";
        int a = s.indexOf("(") + 1;
        int b = s.indexOf("pages");
        System.out.println(s.substring(a, b).trim());
    }
}
