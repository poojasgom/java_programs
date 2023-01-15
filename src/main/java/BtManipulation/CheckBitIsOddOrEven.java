package BtManipulation;

//n&1 => number AND 1 will give us the lSB. if lsb = 1 (its odd) else even.
public class CheckBitIsOddOrEven {

  public static void main(String[] args) {

    int bitToCheck = 12;
    int bitMask = 1; //(with whom we will perform AND operation. )

    if((bitMask&bitToCheck) == 0){
      System.out.println("even Number");
    }else{
      System.out.println("odd number");
    }
  }

}
