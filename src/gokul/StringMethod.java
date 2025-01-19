package gokul;

public class StringMethod
{
    public static void main (String[]args){
        String a="Hello";
        System.out.println(a.length());//present how many letters 5
        String b="hello";
        System.out.println(b.toUpperCase());//All letters be capital
        String c="HELLO";
        System.out.println(c.toLowerCase());//All letters be small
        String d="Hello";
        System.out.println(d.charAt(3));//takes index number letters
        String e="Hello";
        System.out.println(e.substring(2,4));//it takes the beginning number it will not takes last number
        String f="Hello Gokul";
        System.out.println(f.contains("Gokul"));//if the letters are there it will be true if not false
        String g="Hello Gokul";
        String h="hello gokul";
        System.out.println(g.equals(h));//The given values are same true if not false
        System.out.println(g.equalsIgnoreCase(h));//don't checks the letters checks the sentences
        String i="    Hello Gokul";
        System.out.println(i.trim());//space we use trim
        String j="Gokul is fun character";
        System.out.println(j.replace("fun","good"));//replace the words
        String k="Ajay,Gokul,Kabil";
        String[]names=k.split(",");
        for(String x:names){
            System.out.println(x);//remove ,
        }
    }
}
