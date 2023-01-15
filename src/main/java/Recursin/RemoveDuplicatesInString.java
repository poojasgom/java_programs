package Recursin;

//fn= isPresent (n-1);
public class RemoveDuplicatesInString {

  public static StringBuilder removeDuplicate (String sr, int index, StringBuilder sb, boolean[] tracker){
//base case.
    if(index == sr.length()){
      return sb;
    }

    char currentChar = sr.charAt(index);
    if(tracker[currentChar-'a'] == true){
      removeDuplicate(sr, index+1, sb, tracker);
    }
    else{
      tracker[currentChar-'a']=true;
      removeDuplicate(sr, index, sb.append(currentChar), tracker);
    }
    return sb;
  }
  public static void main(String[] args) {
    String x = "ppooooonndddeer";
    char[] charArr = x.toCharArray();
    StringBuilder sb= new StringBuilder("");
    System.out.println(removeDuplicate(x, 0, sb, new boolean[26]));
  }
}
