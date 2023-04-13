package polymorphism;

class Test {
    void Show() {
        System.out.println("Show result");
    }
}

class Without_Overriding extends Test {
    public static void main(String[] args) {
        Without_Overriding obj = new Without_Overriding();
        obj.Show();
    }
}

