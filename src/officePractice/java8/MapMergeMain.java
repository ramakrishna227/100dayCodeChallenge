package java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class MapMergeMain {
  
  static List<String> list=Arrays.asList("cat","bat","rat","mat","fan","son","rat","mat");
public static void main(String[] args) {
 Map<String, Integer> stringCount=new HashMap<>();
  
  /*list.forEach(word->{
   if(!stringCount.containsKey(word)) {
     stringCount.put(word, 0);
   }
   stringCount.put(word, stringCount.get(word)+1);
   
 });
 
 */
 
 
 /*list.forEach(word->{
   stringCount.putIfAbsent(word, 0);
   stringCount.put(word, stringCount.get(word)+1);
 });*/
 
 
 /*list.forEach(word->{
   stringCount.putIfAbsent(word, 0);
   
   stringCount.compute(word, new BiFunction<String, Integer, Integer>() {

    @Override
    public Integer apply(String t, Integer u) {
      
      return u+1;
    }
  });
 });*/
 
/* list.forEach(word->{
   stringCount.compute(word, (k,v)-> v!=null? v+1:1);
 });*/
 
 list.forEach(word -> stringCount.merge(word, 1, (prev,v)->{
   return prev+v;
 }));
  
 stringCount.keySet().stream().forEach(key->{
   System.out.println(key+" "+stringCount.get(key));
 });
}
}

