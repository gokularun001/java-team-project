package gokul;

public class AutomationTask1 {
    public static void main(String[] args) {
                String s = "Showing 1 to 10 of  18922 ( 190 Pages)";
                int start = s.lastIndexOf('(') + 1;
                int end = s.lastIndexOf('P');
                String result = s.substring(start, end).trim();

                System.out.println(result);
            }
}
