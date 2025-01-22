package gokul;

public class Parameter {

    //no parameter , no return value
    void display(){
        System.out.println("Gokul Arun");
    }
    //no parameter , return value
    char givenGrade(){
        System.out.println("grade");
        return 'A';
    }
    //Takes parameter , no return valua
    void addPercentage(int a, String b, int c){
        System.out.println(a+b+c);
    }
    //Takes parameter , Takes return value
    int addvalue(int a, int b, int c){
        return (a+b+c);
    }
    public static void main(String[]args){
        Parameter vijay= new Parameter();
        vijay.display();
        char grade = vijay.givenGrade();
        System.out.println(grade);
        vijay.addPercentage(90,"arun",70);
        int given= vijay.addvalue(90,80,70);
        System.out.println(given);
    }
}
