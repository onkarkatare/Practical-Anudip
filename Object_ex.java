	package com;
	
	public class Object_ex {
	    int age;
	    String name;
	    String address;

	    public static void main(String[] args) {
	        // Create the first object
	        Object_ex ob = new Object_ex();
	        ob.age = 20;
	        ob.name = "Onkar";
	        ob.address = "Solapur";

	        // Create the second object
	        Object_ex ob1 = new Object_ex();
	        ob1.age = 20;
	        ob1.name = "Vijay";
	        ob1.address = "Solapur";

	        // Create the third object
	        Object_ex ob2 = new Object_ex();
	        ob2.age = 20;
	        ob2.name = "Akshay";
	        ob2.address = "Solapur";

	        // Print the information of the three students 
	        System.out.println("Details of the first student: " + ob.age + " years old, " + ob.name + ", " + ob.address);
	        System.out.println("Details of the second student: " + ob1.age + " years old, " + ob1.name + ", " + ob1.address);
	        System.out.println("Details of the third student: " + ob2.age + " years old, " + ob2.name + ", " + ob2.address);
	    }
	}
