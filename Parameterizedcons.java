package Constructor;


	public class Parameterizedcons {
		int age;
		String name;
		// parameterized cons where we have to pass the parameter / arguments
		Parameterizedcons (int a, String n) {
		age=a;
		name = n;
		}
		void show () {
		System.out.println (age+" "+name); }
		public static void main(String[] args) {
		Parameterizedcons d=new Parameterizedcons (22, "ONkar");
		Parameterizedcons d1=new Parameterizedcons (20, "Blblad");
		Parameterizedcons d2=new Parameterizedcons (25, "fdjfg");
		d.show();
		d1.show();
		d2.show();
		}
}

