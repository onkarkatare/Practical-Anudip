package inheritence;

class simple {
	int marks = 85;
}
class child extends simple{
	int Add= 5;
	public static void main(String[] args) {
		
	
		child ob=new child();
		System.out.println("Total marks: "+ (ob.marks+ob.Add));
				
	}
}

