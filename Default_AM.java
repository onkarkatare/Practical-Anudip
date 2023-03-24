package Access_Mod;
import package_first.*;
public class Default_AM extends Default_AM_Tst{
public static void main(String[] args) {
// outside package can not access default method & class 
	Default_AM obj = new Default_AM(); 
	obj.protect();
}
}

