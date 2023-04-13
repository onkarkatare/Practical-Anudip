package abstarction;

abstract class Testabstract {
    // abstract class -- parent class
    abstract void display(); // abstract method

    // non abstract method
    /*
    void show() {
        System.out.println("non abstract method invoked");
    }
    */
}

class Demol extends Testabstract { // 1st child class
    // abstract method of parent class
    void display() {
        System.out.println("Demol method invoked");
    }
}

class Demo2 extends Testabstract { // 2nd child class
    // abstract method of parent class
    void display() {
        System.out.println("demo2 method invoked");
    }
}

public class AbstractMethodDemo {
    public static void main(String[] args) {
        Demol child1 = new Demol();
        Demo2 child2 = new Demo2();
        child1.display();
        child2.display();
        //child2.show();
    }
}
