package Constructor;

public class const_overload {
	int age;
	String name;
	String adress;
	//constructor 1 with 2 argument
	const_overload(int a,String n){
		age=a;
		name=n;
	}
	//constructor 2 with 3 argument
	const_overload(int a,String n,String ad){
		age=a;
		name=n;
		adress=ad;
	}
	public void show() {
		System.out.println("Name="+name+" Age="+age+" Address="+adress);
	}
	public static void main(String[] args) {
		const_overload ob =new const_overload(25,"Rajesh");
		const_overload ob2=new const_overload(30,"Harish","Solapur");
		ob.show();
		ob2.show();
		
	}
}
