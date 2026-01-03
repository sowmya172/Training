public class Student {
    String name;
    int age;
    char gender;

    Student(String n, int a, char g) {
        name = n;
        age = a;
        gender = g;
    }

    public static void main(String[] args) {
        Student obj = new Student("Sowmya", 19, 'F');
        System.out.println(obj.name + " " + obj.age + " " + obj.gender);
    }
}