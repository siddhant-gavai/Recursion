public class LastOccurance {
    public static int lastOccurance(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurance(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7, 5, 9, 5, 9 };
        int key = 9;
        System.out.println(lastOccurance(arr, key, 0));
    }
}