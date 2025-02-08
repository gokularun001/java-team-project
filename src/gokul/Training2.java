package gokul;

public class Training2 {
    public static void main(String[]args){
        String a="kabil@gmail.com"; //extract only name
        String b="$13,44,666"; //extract only number
        String c="abcd1234efgh5678"; //extract only number
        System.out.println(a.substring(0,5));
        System.out.println(b.replace("$","").replace(",",""));
        System.out.println(c.replaceAll("[^0-9]",""));
        // [0-9]matches any digit(0 to 9)
        // [^0-9]matches everything except digits
        System.out.println(c.replaceAll("[^a-zA-Z]",""));
        }
    }

