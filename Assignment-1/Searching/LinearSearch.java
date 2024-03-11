package Searching;

public class LinearSearch {
    // Write a function to implement linear search
    public static int linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Test the linear search function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 4;
        int result = linearSearch(arr, x);
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
