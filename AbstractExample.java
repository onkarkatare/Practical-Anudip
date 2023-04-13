package abstarction;

abstract class Bank {
    abstract int rateOfInterest();
}

class RBI extends Bank {
    int rateOfInterest() {
        return 7;
    }
}

class SBI extends Bank {
    int rateOfInterest() {
        return 8;
    }
}

class PNB extends Bank {
    int rateOfInterest() {
        return 9;
    }
}

class BOB extends Bank {
    int rateOfInterest() {
        return 6;
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Bank bank = new PNB();
        System.out.println(bank.rateOfInterest());
    }
}
