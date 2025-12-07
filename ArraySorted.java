public class ArraySorted {
    public static boolean isSorted(int arr[], int i) {
        // Base case: If we reach the last element, the array is sorted
        if (i == arr.length - 1) {
            return true;
        }

        // Check if the current element is greater than the next element
        if (arr[i] > arr[i + 1]) {
            return false; // Array is not sorted
        }

        // Recursive call for the next index
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println(isSorted(arr, 0)); // Output: true

    }
}
