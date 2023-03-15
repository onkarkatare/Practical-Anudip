class Default{

int a;
short b;
long c;
double g;
float h;
char m;
void show(){
System.out.println( "int :" +a );
System.out.println( "short :" +b); 
System.out.println("long :" +c );
System.out.println( "double :"+g );
System.out.println("float :"+h );
System.out.println( "char :"+m+"|");
}
public static void main (String args[]){ 
    Default object = new Default();
object.show();
}
}
