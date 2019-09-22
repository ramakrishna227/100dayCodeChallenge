package recursion;

public class PalindromesNumber {
public static void main(String[] args) {
  try {
  isPal(123216);
  System.out.println("Num is palindrome");
  }catch(Exception e) {
    System.out.println("Num is not palindrome");
  }
}

private static int isPal(int num) throws Exception {
  if(num<0) {
    num=-num;
  }
  int dupNum=num;
  return isPalUtil(num,dupNum);
  
}

private static int isPalUtil(int num, int dupNum) throws Exception {

  if(num==0) {
    return dupNum;
  }else {
    dupNum=isPalUtil(num/10,dupNum);
  }
  if(num%10==dupNum%10) {
    return dupNum/10;
  }else {
    throw new Exception("Num is not palindrome");
  }
  
}
}
