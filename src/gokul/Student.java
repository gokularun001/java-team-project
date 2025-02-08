package gokul;

public class Student {
    int rollno;
    String name;
    int age;
    char grade;

    void display(){
        System.out.println(rollno+""+name+""+age+""+grade);
    }
    public static void main(String[]args){
        Student gokul = new Student();
        gokul.age= 21;
        gokul.name="Gokul";
        gokul.grade='A';
        gokul.rollno=20;
        gokul.display();
    }
}
