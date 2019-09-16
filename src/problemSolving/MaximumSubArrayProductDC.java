package problemSolving;

public class MaximumSubArrayProductDC {
  public static void main(String[] args) {
//{ 6, -3, -10, 0, 2 }
//{-1, -3, -10, 0, 60}
    int[] arr = { 12, 2, -3, 0, -5, -6, -2 };
    int maxProduct = maxSubArrayProduct(arr, 0, arr.length - 1);
    System.out.println(maxProduct);
  }

  private static int maxSubArrayProduct(int[] arr, int i, int j) {
    return 0;
  }
}
