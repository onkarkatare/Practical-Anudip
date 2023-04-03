package inheritence;

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.run(); // which run() method would be called? parent1/parent2?
    }
}

class Parent1 { // parent class 1
    void run() { // parent class 1 user-defined parent method run()
        System.out.println("Parent1 run method");
    }
}

class Parent2 { // parent class 2
    void run() { // parent class 2 user-defined parent method run()
        System.out.println("Parent2 run method");
    }
}

class Child1 extends Parent1,Parent2 { // child class of Parent1
    void run() { // Child1 class user-defined method
        System.out.println("Child1 run method");
    }
}

