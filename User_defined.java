package method;

public class User_defined {
	
	public int add (int a, int b) {
	return a+b;
	} 
	public static void main(String[] args) { 
		User_defined obj = new User_defined(); 
		System.out.println(obj.add (2,3));
	
	}
}
