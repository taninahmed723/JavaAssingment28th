//23. Uses of Local and Instance Variable

public class LocalInstance {

    // Instance Variables
    String studentName;
    int age;

    // Method
    void student(String name, int studentAge) {

        // Local Variables
        String department = "CSE";

        // Assigning values to Instance Variables
        studentName = name;
        age = studentAge;

        System.out.println("Department: " + department);
    }

    // Display Method
    void display() {

        System.out.println("Student Name: " + studentName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        // Creating Object
        LocalInstance student1 = new LocalInstance();

        // Passing values to the method
        student1.student("Tahmid Ahmed", 23);

        // Calling display method
        student1.display();
    }
}