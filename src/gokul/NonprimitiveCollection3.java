package gokul;
import java.util.HashMap;

public class NonprimitiveCollection3 {
    public static void main(String[] args) {
        HashMap<Integer, String> names = new HashMap<>();

        names.put(1, "gopi");
        names.put(2, "kabil");
        names.put(3, "ajay");
        names.put(1, "gokul");
        names.put(2,"kabil");
        names.get(2);
        names.remove(2);
        names. containsKey(1);
        names.containsValue("gopi");
        names.keySet();
        names.values();
        //names.clear();
        System.out.println(names);
    }
}
