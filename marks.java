package polymorphism;

class Subject {
    public int getMarks() {
        return 0;
    }
}

class English extends Subject {
    
    public int getMarks() {
        return 90;
    }
}

class Math extends Subject {
    
    public int getMarks() {
        return 85;
    }
}

class Science extends Subject {
    
    public int getMarks() {
        return 80;
    }
}

class SocialStudies extends Subject {
    
    public int getMarks() {
        return 75;
    }
}

class Computer extends Subject {
    
    public int getMarks() {
        return 95;
    }
}

public class marks {
    public static void main(String[] args) {
        Subject english = new English();
        Subject computer = new Computer();
        
        System.out.println("Marks in English: " + english.getMarks());
        System.out.println("Marks in Computer: " + computer.getMarks());
    }
}
