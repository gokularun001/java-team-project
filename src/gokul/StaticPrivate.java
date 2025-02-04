package gokul;

public class StaticPrivate
{
    static  private String name;
    static int age;
    static String course;
    static private int rollno;

    String getName(){
        return name;
    }

    void setName(String name){
        this.name=name;
    }

    int getRollno(){
        return rollno;
    }

    void setRollno(int rollno){
        this.rollno=rollno;
    }
    public static void main(String[]args){
        StaticPrivate.age=21;
        System.out.println(StaticPrivate.age);
        StaticPrivate.course="Computer Science";
        System.out.println(StaticPrivate.course);
        StaticPrivate h=new StaticPrivate();
        h.setName("Gokul Arun");
        h.setRollno(100);
        System.out.println(h.getName());
        System.out.println(h.getRollno());
    }
}
