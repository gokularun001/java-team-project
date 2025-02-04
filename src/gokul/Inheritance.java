package gokul;

public class Inheritance {
    void start() {
        System.out.println("Vehicle is starting");
    }

    class Bike extends Inheritance {
        void drive() {
            System.out.println("bike is driving");
        }
    }

    class Brake extends Bike {
        void stop() {
            System.out.println("put brake in bike");
        }
    }

    public static void main(String[] args) {
        Bike i = new Bike();
        i.drive();
        i.start();
        Brake j = new Brake();
        j.start();
        j.drive();
        j.stop();
    }
}