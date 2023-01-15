package InheritancePackage;

public class MultilevelInheritance {

  int a = 5;
}

  class Mammals extends MultilevelInheritance {

   int breatheCount = 10;
   int legs;
 }

 class Dog extends  Mammals {

   String breed;




  public static void main(String[] args) {
   Dog dogOBHE = new Dog();
   dogOBHE.breed = "POMERIAN";
   dogOBHE.breatheCount=10;
   dogOBHE.a=10;
    System.out.println(dogOBHE.breed);
  }
 }
