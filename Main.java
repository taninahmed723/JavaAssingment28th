//22.Student class with 3 object

class Student {

    int id;
    String name;
    

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        

    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 36;
        s1.name = "Tahmid";
        

        s2.id = 60;
        s2.name = "Nice";
        

        s3.id = 22;
        s3.name = "Rafi";
        

        s1.display();
        s2.display();
        s3.display();
    }
}
