public class FirstOccurance {
    public static int firstOccurance(int arr[], int key, int i) {
        // Base case: If we reach the end of the array
        if (i == arr.length) {
            return -1; // Key not found
        }

        // If the current element matches the key, return the index
        if (arr[i] == key) {
            return i;
        }

        // Recursive call for the next index
        return firstOccurance(arr, key, i + 1);
    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 5, 7, 5, 9, 5 };
        int key = 5;
        System.out.println(firstOccurance(arr, key, 0)); // Output: 2
    }
}
