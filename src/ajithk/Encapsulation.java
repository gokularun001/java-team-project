package ajithk;

import com.sun.tools.javac.Main;

public class Encapsulation {
     double balance;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setbalance(double amound) {

        if (amound > 0) {
            balance = amound;
        } else {
            System.out.println("invalid amount");
        }

    }

    public double getBalance() {
        return balance;
    }
    }class Maain{


                public static void main(String[] args) {
                Encapsulation myaccont =new  Encapsulation ();

                myaccont.setbalance(10000);
                    System.out.println("balance");

                    myaccont.getBalance();
                }
   }




