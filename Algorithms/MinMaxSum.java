package Algorithms;

/**
 * Created by RaedMassoud on 2/13/2024
 *
 * @author: RaedMassoud
 * @date: 2/13/2024
 * @project: HackerRank-Solutions
 */
public class MinMaxSum {

    // This method finds the min and max sum of an array by using
    // exactly n - 1 digits
    private void find(int[] arr) {

        // Sort the array
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr.length - i - 1; j++) {

                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Initialize vars
        long minSum = 0;
        long maxSum = 0;

        // Min sum is the sum of digits till n - 1
        // Max sum is the sum of digits from n till 1
        for(int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
            maxSum += arr[arr.length - i - 1];
        }

        System.out.println(minSum + " " + maxSum);
    }

}
