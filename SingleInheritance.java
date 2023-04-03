package inheritence;

public class SingleInheritance { // main class
public static void main(String[] args) {
	SIChild child = new SIChild(); // create a object of child class child.display();
		child.show();
		child.display();
	}
}
class SIParent { // parent class 
	void show() { // parent class user defined method 
		System.out.println("Show the details of parent class");
}
}
class SIChild extends SIParent{ // child class 
	void display () { //child class user defined method 
		System.out.println("Display the result");
}
}