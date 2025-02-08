package gokul;

public class Encapsulation {
        private String name;
        private int age;

        String getName() {
            return name;
        }

        void setName(String name) {
            this.name = name;
        }

        int getAge() {
            return age;
        }

        void setAge(int age){
            this.age=age;
        }
        public static void main(String[] args) {

            Encapsulation person=new Encapsulation();
            person.setName("Gokul");
            person.setAge(21);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
}
