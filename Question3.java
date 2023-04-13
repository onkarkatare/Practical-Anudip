package polymorphism;

import java.util.Scanner;

class Parent {
    void show(int p) {
        System.out.println("The value of p: " + p);
    }
    
    void print(int q) {
        System.out.println("The value of q: " + q);
    }
}

class NewChild extends Parent {
    @Override
    void show(int p) {
        System.out.println("The value of r: " + p);
    }
    
    @Override
    void print(int q) {
        System.out.println("The value of s (Square): " + q * q);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of t: ");
        int t = sc.nextInt();
        while (t > 0) {
        		System.out.print("Enter the value of p: ");
        	    int p = sc.nextInt();

        	    System.out.print("Enter the value of q: ");
        	    int q = sc.nextInt();

        	    System.out.print("Enter the value of r: ");
        	    int r = sc.nextInt();

        	    System.out.print("Enter the value of s: ");
        	    int s = sc.nextInt();

            
            Parent obj1 = new Parent();
            obj1.show(p);
            obj1.print(q);
            
            Parent obj2 = new NewChild();
            obj2.show(r);
            obj2.print(s);
            t--;
            
        }
    }
}
