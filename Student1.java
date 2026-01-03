public class Student1 {
    String name;
    int rollno;
    
    Student1(String n, int a){
        name = n;
        rollno = a;
    }
    void display(){
        int marks = 90;
        System.out.println(name+" "+marks+" "+rollno);
    }
    public static void main(String[] args) {
        Student1 obj = new Student1("Sowmya", 556);
        obj.display();
    }
}