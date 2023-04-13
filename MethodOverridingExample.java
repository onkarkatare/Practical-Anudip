package polymorphism;

class Employee {
    int salary;
    
    public Employee(int salary) {
        this.salary = salary;
    }
    
    public void incrementSalary() {
        salary += 1000;
        System.out.println("Employee salary incremented by 1000");
    }
}

class Developer extends Employee {
    public Developer(int salary) {
        super(salary);
    }
    
    public void incrementSalary() {
        salary += 2000;
        System.out.println("Developer salary incremented by 2000");
    }
}

class Manager extends Employee {
    public Manager(int salary) {
        super(salary);
    }
    
    public void incrementSalary() {
        salary += 5000;
        System.out.println("Manager salary incremented by 5000");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(50000);
        Developer d1 = new Developer(60000);
        Manager m1 = new Manager(80000);
        
        e1.incrementSalary(); // Output: Employee salary incremented by 1000
        d1.incrementSalary(); // Output: Developer salary incremented by 2000
        m1.incrementSalary(); // Output: Manager salary incremented by 5000
    }
}

