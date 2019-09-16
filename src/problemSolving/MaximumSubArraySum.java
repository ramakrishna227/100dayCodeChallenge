package problemSolving;

public class MaximumSubArraySum {
  public static void main(String[] args) {
    int[] arr = { -2, -5, 6, -2, -3, 1, 5, -6 };
    int maxSoFar = 0;
    int maxEndingHere = 0;
    for (int i = 0; i < arr.length; i++) {
      maxEndingHere += arr[i];
      if (maxEndingHere < 0) {
        maxEndingHere = 0;
      }
      if (maxEndingHere > maxSoFar) {
        maxSoFar = maxEndingHere;
      }
    }
    System.out.println(maxSoFar);
  }
}
