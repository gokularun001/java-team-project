package ajithk;

public class ConstructorMetod {
    ConstructorMetod (String food,int price,int tokenno) {

        System.out.println(food + "  " + price + "  " + tokenno);
    }
    ConstructorMetod(String hi,int age){
        System.out.println("hello"+ hi+age);
    }


    void ajay (){
        System.out.println("hi makaleyi");
    }

    public static void main(String[] args) {
       ConstructorMetod ak = new ConstructorMetod("hello",22);
        ConstructorMetod ab =new ConstructorMetod("biriyani"    ,250,12);
        ak.ajay();
    }
}
