package kabil;

public class GopiAmnt1 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "banana", "guava"};
        String search = "banana";
        int num;
        int not = 0;
        for (int i = 0; i <= 2; i++) {
            if (search.equals(fruits[i])) {
                num = i;
                System.out.println("the " + search + " found in the index: " + num);
                not += 1;//search match agalana not 0 la dha irukum so,see below
            }
        }
        if (not == 0) {
            System.out.println("not found");
        }
    }
}
