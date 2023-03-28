package Constructor;

public class def_constructor {
	
		def_constructor () {// default cons
		System.out.println("Default Cons Called");
		}
		public static void main(String[] args) {
		// cons called at the time of object creation with new() keyword 
			def_constructor obj = new def_constructor();
		}
		
}
