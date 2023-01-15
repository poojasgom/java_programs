package Strings;

//aaabbbccd ->a3b3c2d
public class StringCompression {

  public static void main(String[] args) {
    String s = "aaabbbccdee";
    System.out.println(compressTheString(s));
  }

  private static String compressTheString(String s) {
    String newString ="";
    StringBuilder sb = new StringBuilder("");

    for(int i=0; i<s.length();i++){
      int count = 1;
      while( i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
      count++;
      i++;
    }
    sb.append(s.charAt(i));
    if(count>1){
      sb.append(count);
    }
    }return sb.toString();
  }
}
