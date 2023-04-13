package polymorphism;

public class Overload_Main_Method {
    // JVM calls the main method with String array
    public static void main(String[] args) {
        System.out.println("Main with String type array");
    }

    public static void main(String args) {
        System.out.println("Main without array");
    }

    public static void main() {
        System.out.println("Main without arguments");
    }
}
