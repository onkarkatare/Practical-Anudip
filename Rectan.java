package abstarction;

abstract class Shape {
    abstract double area();
    abstract double perimeter();
}

class Rectangle extends Shape {
    double length, width;
    
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    
    double area() {
        return length * width;
    }
    
    double perimeter() {
        return 2 * (length + width);
    }
}

public class Rectan {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + r.area());
        System.out.println("Perimeter of rectangle: " + r.perimeter());
    }
}

