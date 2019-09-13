package sundayCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KLargestElementsFromFile {
  static String url = "C:\\Users\\rkurisetti\\Desktop\\input.txt";

  public static void main(String[] args) {
    try {
      FileReader fr = new FileReader(new File(url));
      /*char characterRead;
      int intChar;
      while((intChar=fr.read())!=-1) {
      characterRead=(char)intChar;
      System.out.println(characterRead);
      }*/
      System.out.println("Enter k value");
      Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int[] result = new int[k];
      String line;
      BufferedReader br = new BufferedReader(fr);
      while ((line = br.readLine()) != null) {
        List<String> split = Arrays.asList(line.split(","));
        for (String str : split) {
          int num = Integer.parseInt(str);
          for(int i=0; i<result.length; i++) {
            if(num>result[i]) {
              for(int j=i; j<result.length-1; j++)
              {
                result[j+1]=result[j];
              }
              result[i]=num;
              break;
            }
          }
        }
      }
      Arrays.stream(result).forEach(System.out::println);
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
