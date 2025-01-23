package ajithk;

public class Return {


    void ajay (){
        System.out.println("hello");
    } // no parameter no return value


    String aajay () {

        return ("i am ajith");}// no parameter and return value


    String kumar (String name,int a)
    {
        return ("hai "+name+" my age "+a);
    }

    public static void main(String[] args) {
        Return abc = new Return();
        abc.ajay();

        String a =abc.aajay();
        System.out.println(abc.aajay());




    }
    
}
