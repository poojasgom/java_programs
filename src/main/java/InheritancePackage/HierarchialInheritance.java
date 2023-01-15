package InheritancePackage;

//onebase class inherits from 1 or more derived class.
public class HierarchialInheritance {

  String food;
  public void sleep(){
    System.out.println("Sleeps");
  }



}

class Mammal extends HierarchialInheritance{
  public void walk(){
    System.out.println("Walks");
  }

  class Fish extends HierarchialInheritance{
    public void swim(){
      System.out.println("SWIM");
    }
  }

   static class Bird extends HierarchialInheritance{
    public void fly(){
      System.out.println("FLY");
    }
  }
  public static void main(String[] args) {
    Bird obj = new Bird();
    obj.sleep();
  obj.fly();

  }

}
