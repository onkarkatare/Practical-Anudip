package finall;

final class Finalclass {
    void show() {
        System.out.println("Final class method");
    }
}

/*class Test extends Finalclass { // can't extend final class
    void show() {
        System.out.println("child class override method");
    }
}*/

public class FinalclassDemo { // Main class
    public static void main(String[] args) {
        Finalclass t = new Finalclass();
        t.show();
    }
}
