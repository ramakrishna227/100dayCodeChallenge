import java.util.Scanner;

public class ScannerExample2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = Integer.parseInt(sc.nextLine());

    for (int i = 0; i < count; i++) {
      String s = sc.nextLine();
      String[] split = s.split(" ");
      if (split.length < 3) {
        continue;
      }
      int a = Integer.parseInt(split[0]);
      int b = Integer.parseInt(split[1]);
      int c = Integer.parseInt(split[2]);
      for (int j = 0; j < c; j++) {
        int sum = a;
        for (int k = 0; k <= j; k++) {
          sum = sum + ((int) Math.pow(2, k) * b);
        }
        System.out.print(sum);
      }
      System.out.println();
    }
  }
}
