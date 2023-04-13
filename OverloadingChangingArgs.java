package polymorphism;

public class OverloadingChangingArgs {
    static int sum(int a, int b) { // two parameters/arguments
        return a + b;
    }

    static int sum(int x, int y, int z) { // three arguments
        return x + y + z;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.out.println(sum(2, 3, 4));
    }
}
