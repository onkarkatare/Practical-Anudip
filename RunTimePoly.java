package polymorphism;

class Java_student { // parent class
    String quality() { // parent method
        return null;
    }
}

class Tusher extends Java_student { // child class
    String quality() { // overridden method
        return "Active";
    }
}

class Pooja extends Java_student { // child class
    String quality() {
        return "irregular";
    }
}

class Suhel extends Java_student { // child class
    String quality() {
        return "hard-working";
    }
}

public class RunTimePoly { // main class
    public static void main(String[] args) {
        Java_student js; // reference variable of parent class (upcasting)
        js = new Pooja();
        System.out.println("quality of Pooja is: " + js.quality());
        
        js = new Suhel();
        System.out.println("quality of Suhel is: " + js.quality());
    }
}
