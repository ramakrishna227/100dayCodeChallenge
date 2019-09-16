package problemSolving;

public class MaximumSubArrayProduct {
  public static void main(String[] args) {
//    { 6, -3, -10, 0, 2 }
//    {-1, -3, -10, 0, 60}
    int[] arr = { 12, 2, -3, 0, -5, 0, -6, -2 };
    int maxProductSofar = 1;
    int maxNegativeProduct = 1;
    for (int i = 0; i < arr.length; i++) {
      if (maxNegativeProduct * arr[i] != 0) {
        maxNegativeProduct = maxNegativeProduct * arr[i];
        if (maxNegativeProduct > maxProductSofar) {
          maxProductSofar = maxNegativeProduct;
        }
      } else {
        maxNegativeProduct = 1;
      }

    }
    System.out.println(maxProductSofar);

  }
}
