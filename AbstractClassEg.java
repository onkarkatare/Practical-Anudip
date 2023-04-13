package abstarction;

abstract class Parentabs {
    Parentabs () { // constructor
        System.out.println("No-args Cons");
    }
    
    abstract void show(); // abstract method 
    
    void run() { // non abstract 
        System.out.println("Non abstract method");
    }
}

class Childabs extends Parentabs {
    @Override
    void show() {
        System.out.println("Parent class abstract method");
    }
}

public class AbstractClassEg{
    public static void main(String[] args) {
        Parentabs object = new Childabs();
        object.show();
        object.run();
    }
}
