package gokul;

public class Constructor {
    String name;
    int age;
    int rollNo;

    Constructor(String nam,int ag,int roll){
        name=nam;
        age=ag;
        rollNo=roll;
    }
    Constructor(){
        System.out.println(age);
    }
    void display(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Roll number:" + rollNo);
    }
    public static void main(String[]args){
        Constructor naruto =new Constructor("Gokul Arun",21,201);
        Constructor s=new Constructor();
        naruto.display();
        s.display();
    }

}
