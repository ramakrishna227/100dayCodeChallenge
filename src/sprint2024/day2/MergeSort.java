package sprint2024.day2;

public class MergeSort {
    public void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public void merge(int[] arr, int left, int mid, int end) {
        int leftarraysize = mid - left + 1;
        int rightarraysize = end - mid;
        int[] leftArray = new int[leftarraysize];
        int[] rightArray = new int[rightarraysize];

        for (int i = 0; i < leftarraysize; ++i) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < rightarraysize; ++j) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < leftarraysize && j < rightarraysize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftarraysize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightarraysize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        MergeSort mergeSort = new MergeSort();
        mergeSort.printArray(arr);
        mergeSort.sort(arr, 0, arr.length - 1);
        mergeSort.printArray(arr);
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
