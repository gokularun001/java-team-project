package ajithk;


interface dada{
    int a=500;

    static void ajith(){
        System.out.println("hi gobi bro");
    }
    default  void kumar(){
        System.out.println("good morning");
    }
}
interface mom extends dada{
    void arear();
}
public class IntrefaceAbstrection implements dada{
    public void clear(int a){
        System.out.println("how are you");
    }
    public void happy(){
        System.out.println("wher are you from");
    }
    void brother(){
        System.out.println("what are you doing");
    }

    public static void main(String[] args) {
        IntrefaceAbstrection a =new IntrefaceAbstrection(
                
        );

        a.kumar();
        a.brother();
        a.happy();
        System.out.println(a);
    }
}
