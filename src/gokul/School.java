package gokul;

public class School {
    void display(){
        System.out.println("Gokul Arun");
    }
    int givenNumber(){
        System.out.println("given number");
        return 100;
    }
    public static void main(String[]args){
        School vijay=new School();
        vijay.display();
        int receivedValue=vijay.givenNumber();
        System.out.println(receivedValue);
    }
}
