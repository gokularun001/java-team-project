package ajithk;


public class
ForEach {
    public static void main(String[] args) {
        int number [] ={12,45,67,89};

        for (int i=0;i<4;i++){
            System.out.println(number[i]);//normel loop
        }
        for (int ajay:number){
            System.out.println(ajay);//advance loop

            //string methode

            String num [] ={"12","21","22"};

            for (String aja:num) {
                System.out.println(aja);//advance loop

            }
        }
    }
}
