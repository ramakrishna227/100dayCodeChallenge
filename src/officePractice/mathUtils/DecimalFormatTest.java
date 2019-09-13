package officePractice.mathUtils;

import java.text.DecimalFormat;

public class DecimalFormatTest {
public static void main(String[] args) {
  String str="1054510192.1234567751232232";
  
  Double d=Double.parseDouble(str);
  System.out.println(d);
  
  Float f= Float.valueOf(str);
  
  System.out.println(f);
  
//  System.out.println(sun.misc.FloatingDecimal.parseDouble(str));
  
  
  DecimalFormat decimalFormat=new DecimalFormat("###.####################################");
  
  System.out.println(decimalFormat.format(Double.parseDouble(str)));
}
}
