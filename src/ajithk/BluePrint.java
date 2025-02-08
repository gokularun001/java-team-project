package ajithk;

public class BluePrint {

        int rollno;
        String name;
        int age;

        void display(){
            System.out.println(rollno+""+name+""+age);
        }


    public static void main(String[] args) {
            BluePrint ajay =new BluePrint();
        ajay.age =22;
        ajay.name ="ajay";
        ajay.rollno =21;
        ajay.display();
    }
}
