package gokul;

public class AutomationTask1 {
    public static void main(String[] args) {
                String s = "Showing 1 to 10 of  18922 ( 19078667888 Pages)";
                int start = s.indexOf('(')+2;

                int end = s.indexOf("Pages")-1;
                String result = s.substring(start, end);

                System.out.println("-"+result+"-");
            }
}
