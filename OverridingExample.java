package polymorphism;

class Exam { // parent class
    int marks() { // parent class method
        return 0;
    }
}

class Comp extends Exam { // 1st child class
    int marks() { // override method
        return 80;
    }
}

class Math extends Exam { // 2nd child class
    int marks() {
        return 70;
    }
}

class Science extends Exam { // 3rd child class
    int marks() {
        return 50;
    }
}

class Eng extends Exam { // 4th child class
    int marks() {
        return 90;
    }
}

class OverridingExample {
    public static void main(String args[]) {
        Comp c = new Comp();
        Math m = new Math();
        Science s = new Science();
        Eng e = new Eng();
        System.out.println("Computer marks is: " + c.marks());
    }
}

