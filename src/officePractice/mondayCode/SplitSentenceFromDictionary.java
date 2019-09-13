package mondayCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Need to split question string based on dictionary
public class SplitSentenceFromDictionary {
  static List<String> dictionary = Arrays.asList("i", "a", "love", "you", "am", "happy", "in", "india", "live","dia");
  static String question = "iliveinindia";
  static Map<Integer, Integer> wordsWithLetter = new HashMap<>();
  static String solution = "";
  static String prevWord = "";
  static int nextJ = 0;
  static int[][] validArray = new int[12][12];

  public static void main(String[] args) {
    for (int i = 0; i < 12; i++) {
      for (int j = i; j < 12; j++) {
        if (dictionary.contains(question.substring(i, j + 1))) {
          validArray[i][j] = 1;

        }
      }
    }

    List<String> finalResult = new ArrayList<>();
    List<String> tempStrings = new ArrayList<>();

    for (int i = 0; i < 12; i++) {
      for (int j = i; j < 12; j++) {
        if (validArray[i][j] == 1) {
          if (i == 0) {
            finalResult.add(question.substring(i, j + 1));
          } else {
            for (String s : finalResult) {
              if (i == s.replaceAll("\\s","").length()) {
                tempStrings.add(s +" "+ question.substring(i, j + 1));
              } 
            }
          }
        }
        finalResult.addAll(tempStrings);
        tempStrings.clear();
      }
    }

    finalResult.forEach(s -> {
      if (findLength(s) == question.length())
        System.out.println(s);
    });
  }

  private static int findLength(String s) {
    
    return s.replaceAll("\\s","").length();
  }
}
