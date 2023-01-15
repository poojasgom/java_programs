import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;

//Logic = 1011 = 1*2(to pwer of 0) + 1 *2(to ppwer of 1) + 0 + 2(to power of 2) + 1+(to power of
// 3) =  1*0 + 1*2+ 0*2+ 1*8 =  1+2+0+8 = 11.
public class ConvertBinaryToDecimal {

  public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int power = 0;
  int sum = 0;
  while(n>0){
    int lastDigit = n%10;
    sum = (int) (sum+ lastDigit*Math.pow(2,power));
    n = n/10;
    power++;
  }
    System.out.println("My decimal value for "+ n + " is " +sum);
  }

}
