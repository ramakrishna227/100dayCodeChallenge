package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCountInWord {
public static void main(String[] args) {
  String word="annotation";
 
  //Method 1
  Map<String, Long> characterCount = Arrays.asList(word.split("")).stream().collect(Collectors.groupingBy(c->c,Collectors.counting()));
//  System.out.println(characterCount);
  
  //Method 2
  Map<Character, Long> charCount2 = word.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
  
  //playing with api
  String string = word.codePoints().collect(MyString::getStringBuffer, StringBuilder::appendCodePoint, StringBuilder::append).toString();
  System.out.println(string);
  
   ArrayList<Object> collect = word.codePoints().collect(ArrayList::new, ArrayList::add, ArrayList::add);
  System.out.println(collect);
  
  
  //Another Example
  
  List<Character> charList= Arrays.asList('r','a','m','a');
  String newString = charList.stream().map(c->Character.toString(c)).reduce("",(a,b)->a+b);
  System.out.println(newString);
  
  
  

}
}
class MyString {
  public MyString() {

  }
  static StringBuilder getStringBuffer() {
    System.out.println("returning string buffer");
return new StringBuilder();
  }
}