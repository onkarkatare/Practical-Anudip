package inheritence;

class OperatingSystem { // parent class A
    void boost() {
        System.out.println("Boosting mode on");
    }
}

class Windows extends OperatingSystem { // child class 1
    void run() {
        System.out.println("Run mode on");
    }
}

class Linux extends OperatingSystem { // child class 2
    void storageCapacity() {
        System.out.println("Storage capacity is very high");
    }
}

public class HierarchicalIn {
    public static void main(String[] args) {
        Linux b = new Linux();
        b.boost();
        b.storageCapacity();
        Windows c = new Windows();
        c.run();
        c.boost();
    }
}
