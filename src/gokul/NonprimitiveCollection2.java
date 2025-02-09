package gokul;
import java.util.HashSet;

public class NonprimitiveCollection2 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Kabil");
        names.add("Arasan");
        names.add("kabil");
        names.add("Apple");
        names.contains("Apple");
        names.remove("Apple");
        //names.clear();
        names.isEmpty();
        System.out.println(names.isEmpty());
    }
}
