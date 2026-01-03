public class Member {
       
        String name;
        int age;
        
        void displayInfo() {
            System.out.println("Your name is: " + name);
            System.out.println("Your age: " + age);
        }
        public static void main(String[] args){
        Member obj = new Member();
        obj.name="Sowmya";
        obj.age=20;
        obj.displayInfo();
    }
}