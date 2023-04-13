package abstarction;

interface Vehicle { // parent interface A 
    void running();
}

interface HeavyVehicle { // parent interface B 
    void capacity();
}

class Car implements Vehicle, HeavyVehicle { // child class c 
    void speed() { // child class own method 
        System.out.println("Car speed is very high");
    }

    @Override
    public void capacity() {
        System.out.println("2nd parent interface method");
    }

    @Override
    public void running() {
        System.out.println("1st parent interface method");
    }
}

public class MultipleIn {
    public static void main(String args[]) {
        Car d = new Car(); // object of child class car
        d.speed(); // child class method
        d.running();
        d.capacity();
    }
}
