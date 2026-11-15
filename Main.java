//22.Student class with 3 object

class Student {

    int id;
    String name;
    double marks;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 1;
        s1.name = "Rahim";
        s1.marks = 85;

        s2.id = 2;
        s2.name = "Karim";
        s2.marks = 90;

        s3.id = 3;
        s3.name = "Hasan";
        s3.marks = 80;

        s1.display();
        s2.display();
        s3.display();
    }
}