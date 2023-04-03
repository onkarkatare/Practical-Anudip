package inheritence;

public class MultilevelInheritance {
    // main class
    public static void main(String[] args) {
        SIChild2 child = new SIChild2 (); // create an object of child class2 
        child.show();
        child.display();
        child.print();
    }
}

// parent class
class SIParent1 {
    void show() { // parent class user defined method 
        System.out.println("Show the details of the Parent class");
    }
}

// child class of SIParent1 & parent class of SIChild2 
class SIChild1 extends SIParent1 {
    void display () { // child class user defined method 
        System.out.println("Display the result of the child class 1");
    }
}

// child class 
class SIChild2 extends SIChild1 {
    void print() { // child class user defined method
        System.out.println("Print the output of the child class 2");
    }
}
