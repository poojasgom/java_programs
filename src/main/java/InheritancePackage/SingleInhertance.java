package InheritancePackage;

public class SingleInhertance {

  int a =10;


}
class ChildClass extends SingleInhertance{

  int x = 10;
  public void child(){
    System.out.println(x);
    System.out.println(a);
  }

  public static void main(String[] args) {
    ChildClass obj = new ChildClass();
    obj.x = 10;
    obj.a = 20;
    obj.child();
  }
}
