package polymorphism;

class TestOverriding {
    void run() { // method 1
        System.out.println("running mode on");
    }
}

//creating child class
class Overriding extends TestOverriding {
    //defining same name method as it's declared in the parent class
    void run() { // method 2
        System.out.println("running mode off");
    }
    
    public static void main(String args[]) {
        Overriding a = new Overriding ();
        //creating an object of child class
        a.run();
    }
}

