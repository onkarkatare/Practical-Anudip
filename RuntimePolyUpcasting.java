package polymorphism;

class A {
    void run() {
        System.out.println("Parent class method");
    }
}

class B extends A {
    void run() {
        System.out.println("Child class implementation");
    }
}

public class RuntimePolyUpcasting {
    public static void main(String[] args) {
        A obj = new B(); // upcasting
        obj.run();
    }
}
