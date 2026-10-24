
public class RotateArrayByK {

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60};
        int k = 2;

        int n = arr.length;

        k = k % n;

        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse remaining elements
        reverse(arr, k, n - 1);

        // Reverse complete array
        reverse(arr, 0, n - 1);

        System.out.println("After rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int arr[], int start, int end) {

        while (start < end) {

            int temp = arr[start];

            arr[start] = arr[end];

            arr[end] = temp;

            start++;
            end--;
        }
    }
}
