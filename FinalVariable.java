package finall;
public class FinalVariable {
    final int value = 50; // initialization of final variable

    void display() {
        // value = 70; // We can't change the value of a final variable - compile-time error
        System.out.println(value);
    }

    public static void main(String[] args) {
        FinalVariable fv = new FinalVariable(); // creating object
        fv.display();
    }
}
