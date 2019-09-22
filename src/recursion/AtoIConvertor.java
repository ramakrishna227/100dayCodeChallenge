package recursion;

public class AtoIConvertor {
public static void main(String[] args) {
  String str="112";
  System.out.println(calculateAtoI(str, str.length()));
}

private static int calculateAtoI(String str,int strLen) {
  if(str.length()==1) {
    return Integer.parseInt(str);
  }
  
  return (10*calculateAtoI(str.substring(0,str.length()-1), str.length()-1))+Character.getNumericValue(str.charAt(str.length()-1));
}
}
