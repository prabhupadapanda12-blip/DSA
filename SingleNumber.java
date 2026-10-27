
public class SingleNumber {

    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 4, 5, 3, 2};

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            result = result ^ arr[i];

        }

        System.out.println("Single Number: " + result);
    }
}
