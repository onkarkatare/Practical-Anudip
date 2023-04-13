package inheritence;

public class Aggregation {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA");
        Student student = new Student("John Doe", 20, address);
        student.show();
    }
}

