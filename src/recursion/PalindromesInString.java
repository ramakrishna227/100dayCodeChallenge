package recursion;

import java.util.HashSet;
import java.util.Set;

public class PalindromesInString {
  static Set<String> palindromes = new HashSet<>();

  public static void main(String[] args) {

//    String str = "nitin";
    
    String str="abaaa";
    int n = str.length();
    for (int i = 0; i <= n; i++) {
      for (int j = i + 1; j <= n; j++) {
        isPalindrome(str.substring(i, j));
      }
    }
    
    palindromes.forEach(System.out::println);

  }

  private static void isPalindrome(String s) {
    int length = s.length();
    boolean isPalindrome = true;
    for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
      if (!(s.charAt(i) == s.charAt(j))) {
        isPalindrome = false;
//        System.out.println(s + " is not a palindrome");
      }
    }
    if (isPalindrome) {
      palindromes.add(s);
    }

  }
}
