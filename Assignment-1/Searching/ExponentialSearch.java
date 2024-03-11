package Searching;

public class ExponentialSearch {

    // Write a function to implement exponential search
    public static int exponentialSearch(int[] arr, int x) {
        int n = arr.length;
        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }
        return BinarySearch.binarySearch(arr, x, i / 2, Math.min(i, n));
    }

    // Test the exponential search function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int result = exponentialSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
    
}
