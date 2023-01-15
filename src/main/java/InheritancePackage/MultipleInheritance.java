package InheritancePackage;

public class MultipleInheritance {

}

interface Herbivore{
  public void eatsGreens();
}

interface Carnivore{
  public void eatsFlesh();
}

class Bear implements Herbivore, Carnivore{

  public void eatsGreens() {
    System.out.println("Bear eats greens");
  }

  public void eatsFlesh() {
    System.out.println("bear eats flesh");
  }
}
