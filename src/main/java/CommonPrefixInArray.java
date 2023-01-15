public class CommonPrefixInArray {

  public static void main(String[] args) {
    String[] arr = {"geek", "geeks", "geek4geeks"};
    String commonPrefix = myCommonPrefix(arr);
    System.out.println(commonPrefix);
  }

  //compare 2 strings to find the prefix
  private static String findCommonPrefix(String arr, String arr2) {
    int len1= arr.length();
    int len2 = arr2.length();

    String result = "";
    for(int i=0,j=0;i<len1&&j<len2;i++,j++){
      if(arr.charAt(i) != arr.charAt(j)){
        break;
      }
      result+=arr.charAt(i);
    }
    return result;
  }

  private static String myCommonPrefix(String[] arr) {
    String prefix = arr[0];
    for(int i=0;i<arr.length;i++){
      prefix = findCommonPrefix(prefix, arr[i]);
    }
    return prefix;
  }
}
