package AbstractClassImplementation;

//no obj can be created, has both abs and non abs methods, can have constructors, any class
// extending abs has to implement all its methods.
public class AbsClass {

  public static void main(String[] args) {
    Horse h = new Horse();
    h.walks();
    h.eat();

    Hen hen = new Hen();
    hen.walks();
    hen.eat();

    /*Animal a = new Animal() {
      @Override
      void walks() {

      }
    }*/
  }

}

abstract  class Animal{
  public void eat(){
    System.out.println("EATS FOOD");
    }
    abstract void walks();
}

class Horse extends Animal{
  public void walks(){
    System.out.println("walks on 4 legs");
  }
}

class Hen extends Animal{
  public void walks(){
    System.out.println("walks on 2 legs");
  }
}