package Recursin;

public class TowerOfHanoi {

  public static void toweroFHanoi(int n, char src, char dest, char help){
    if(n==1){
      System.out.println("Move nth disk from "+src +"to dest" +dest);
    }

    toweroFHanoi(n-1, src, help, dest);
    System.out.println("MOve disk "+src +"to" +dest);
   toweroFHanoi(n-1, help, dest,src);
  }
  public static void main(String[] args) {

  }
}
