package problemSolving;

public class MaximumSubArraySumDC {
  public static void main(String[] args) {
    int[] arr = { 1, -2, 3};
    int n = arr.length;
    int max_sum = maxSubArraySum(arr, 0, n - 1);
    System.out.println(max_sum);

  }

  private static int maxSubArraySum(int[] arr, int start, int end) {
    if (start == end) {
      return arr[start];
    }
    int middle = (start + end) / 2;

    return Math.max(Math.max(maxSubArraySum(arr, start, middle), maxSubArraySum(arr, middle + 1, end)),
        maxCrossingSum(arr, start, middle, end));
  }

  private static int maxCrossingSum(int[] arr, int start, int middle, int end) {
    int sum = 0;
    int leftSum = Integer.MIN_VALUE;
    for (int i = middle; i >= start; i--) {
      sum = sum + arr[i];
      if (sum > leftSum) {
        leftSum = sum;
      }
    }
    sum = 0;
    int rightSum = Integer.MIN_VALUE;
    for (int i = middle + 1; i <= end; i++) {
      sum = sum + arr[i];
      if (sum > rightSum) {
        rightSum = sum;
      }
    }
    return leftSum + rightSum;
  }
}
