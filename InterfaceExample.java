package abstarction;



interface MyShape {
   void shape_name();
}

class User_Circle implements MyShape {
   @Override
   public void shape_name() {
      System.out.println("Draw a circle");
   }
}

class User_Triangle implements MyShape {
   @Override
   public void shape_name() {
      System.out.println("Draw a triangle");
   }
}

public class InterfaceExample {
   public static void main(String[] args) {
      MyShape object = new User_Triangle();
      object.shape_name();
   }
}
