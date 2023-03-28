package Constructor;

public class Employee {
    int age;
    String name;
    String position;
    int salary;

    // parameterized constructor
    Employee(int ag, String nam, String positio, int salar) {
        age = ag;
        name = nam;
        position = positio;
        salary = salar;
    }

    // default constructor
    Employee() {
        age = 0;
        name = "Unknown";
        position = "Unknown";
        salary = 0;
    }

    void show() {
        System.out.println(name + " -" + position + " - Age: " + age + ", Salary: Rs " + salary);
    }

    public static void main(String[] args) {
        // creating objects using parameterized constructor
    	System.out.println("\n\tParameterized constructor");
        Employee e1 = new Employee(22, "John", "Software Engineer", 70000);
        Employee e2 = new Employee(27, "Harish", "Project Manager", 90000);
        Employee e3 = new Employee(32, "Wick", "Sales Manager", 80000);
        Employee e4 = new Employee(32, "Akash", "Intern", 60000);

        // creating objects using default constructor and setting values
        Employee e5 = new Employee();
        e5.name = "Rajesh";
        e5.position = "Intern";
        e5.salary = 30000;

        // calling the show method to display employee details
        e1.show();
        e2.show();
        e3.show();
        e4.show();
        System.out.println("\n\tDefault constructor");
        e5.show();
    }
}

