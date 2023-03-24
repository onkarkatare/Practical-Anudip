package Access_Mod;

class Test {
private int a =10;
private void display() {
System.out.println("Private method");
}
}
public class Private_AM{
public static void main(String[] args) {
Test obj = new Test(); //compilation error
System.out.println(obj. a); // outside class cant access private datamember obj.display();// outside class cant access private method
}
}
