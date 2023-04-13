package polymorphism;

public class Example {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(int a, int b) {
        return (double)(a + b);
    }
    
    public static void main(String[] args) {
        Example ex = new Example();
        int sum = ex.add(2, 3); // This line will result in a compilation error
    }
}

