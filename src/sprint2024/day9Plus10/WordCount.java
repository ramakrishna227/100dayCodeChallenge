package sprint2024.day9Plus10;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is word count program to check word count in string";
        Map<String, Integer> wordCountMap = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }
        System.out.println(wordCountMap);
    }

}
