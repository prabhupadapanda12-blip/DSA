
public class MaximumDifference {

    public static void main(String[] args) {

        int arr[] = {7, 1, 5, 3, 6, 4};

        int min = arr[0];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {

            int diff = arr[i] - min;

            if (diff > maxDiff) {
                maxDiff = diff;
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum Difference: " + maxDiff);
    }
}
