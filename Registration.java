public class Registration {
    String name;
    int password;
    int age;
    char gender;

    void form() {
        System.out.println("Name: " + name);
        System.out.println("Pasword: " + password);
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);
    }
}

class Main {
    public static void main(String[] args) {
        Registration r = new Registration();
        r.name = "Tanushka";
        r.password = 123;
        r.age = 10;
        r.gender = 'F';
        System.out.println("Display details: ");
        r.form();
    }
}