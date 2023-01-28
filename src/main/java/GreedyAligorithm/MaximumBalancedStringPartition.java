package GreedyAligorithm;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;
import java.util.Arrays;

/*
WehavebalancedstringstrofsizeNwithanequalnumberofLandR,thetaskistofindamaximumnumberX,
suchthatagivenstringcanbepartitionedintoXbalancedsubstring.
Astring is called to be balanced if the number of ‘L’s in the string equals the number of ‘R’s.
Input: “LRRRRLLRLLRL” Output: 3
O(n) TIme - O(1)
 */
public class MaximumBalancedStringPartition {

  public static void main(String[] args) {
    String s = "LRRRLLRRL";

    if(s.length() == 0){
      System.out.println("String is empty");
      return;
    }
    int n = s.length();
    int i = 0, leftCount =0,rightcount=0;

    while (i<s.length()){
      int ch = s.charAt(i);
      if((ch =='L')){
        leftCount++;
      }else if(ch=='R'){
        rightcount++;
      }
      i++;
    }
    if(leftCount == rightcount){
      System.out.println("Balanced");
    }else{
      System.out.println("Not Balanced");
    }
  }
}
