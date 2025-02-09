package gokul;
import java.util.ArrayList;

public class NonprimitiveCollection {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Gokul");
        names.add("Arun");
        names.add("Gokul");
        //names.clear();
        //names.remove(1);
        names.set(2,"Vijay");
        names.get(1);
        names.size();
        names.contains("Vijay");
        System.out.println(names.contains("Vijay"));
    }
}
