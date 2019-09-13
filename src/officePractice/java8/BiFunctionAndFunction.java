package officePractice.java8;

import java.util.function.BiFunction;

public class BiFunctionAndFunction {
public static void main(String[] args) {
  BiFunction<Integer,Integer,Integer> biFunction=(a,b)->a+b;
  System.out.println(biFunction.apply(100,200));
  
  biFunction=biFunction.andThen(a->a+18);
  
  System.out.println(biFunction.apply(100, 200));
  
}
}
