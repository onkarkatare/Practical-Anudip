package polymorphism;

public class Overloadingtypepromotion {
    // method 1
    void add(int a, double b) {
        System.out.println(a + b);
    }
    // method 2
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void main(String args[]) {
        Overloadingtypepromotion obj = new Overloadingtypepromotion();
        obj.add(2, 3.0); // 2nd int value (3) will be promoted to double
        obj.add(10, 30, 20);
    }
}
