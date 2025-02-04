package ajithk;

public class Inheritance {
    class dad {
        int money =100000;
    }
    class son extends dad {

    }

    public static void main(String[] args) {
        son a = new son();
        System.out.println(a.money);
    }
}
