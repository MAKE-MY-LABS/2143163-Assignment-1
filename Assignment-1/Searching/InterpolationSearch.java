package Searching;

public class InterpolationSearch {
    // Write a function to implement interpolation search
    public static int interpolationSearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right && x >= arr[left] && x <= arr[right]) {
            int pos = left + ((x - arr[left]) * (right - left) / (arr[right] - arr[left]));
            if (arr[pos] == x) {
                return pos;
            }
            if (arr[pos] < x) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
        return -1;
    }

    // Test the interpolation search function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int result = interpolationSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
    
}
