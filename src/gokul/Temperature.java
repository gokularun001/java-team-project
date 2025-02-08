package vijay;

public class Temperature
{
    public static void main(String[]args){
        int temperature=25;
        if(temperature<15){
            System.out.println("Cold");
        }
        else if(temperature>=15&&temperature<=30){
            System.out.println("Warm");
        }
        else{
            System.out.println("Hot");
        }
    }
}
