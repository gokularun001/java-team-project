package ajay;

public class FruiteString {
    public static void main(String[] args) {
        String[] ak = {"apple", "orange", "banana", "mango",};
        String serchefruite = "apple";
        int not =0;
        for (String fruite :ak ){
            if (fruite.equals(serchefruite)) {
                System.out.println("true");
                break;
            }

            if (not ==0){
                System.out.println("false");
                break;
            }
        }
        }
}