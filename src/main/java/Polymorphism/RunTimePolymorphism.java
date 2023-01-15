package Polymorphism;

//Method overriding - same function name with same params present in 2 classes with diff behavior
// in each.
public class RunTimePolymorphism {

  public static void main(String[] args) {
Class2 obj = new Class2();
    System.out.println(obj.welcome()); //prints child class logic
  }
}
class Class1{
  public String welcome(){
    return "HELLO";
  }
}

class Class2 extends Class1{
  public String welcome(){
    return "WORLD";
  }
}


