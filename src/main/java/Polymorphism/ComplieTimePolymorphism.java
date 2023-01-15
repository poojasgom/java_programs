package Polymorphism;

//function overloading
public class ComplieTimePolymorphism {

  public static void main(String[] args) {
Calculator obj = new Calculator();
obj.sum(1,2);
obj.sum((float)(1.5),(float)(2.5));
  }
}

class Calculator{
  int sum(int a, int b){
    return a+b;
  }
  float sum(float a, float b){
    return a+b;
  }
}
