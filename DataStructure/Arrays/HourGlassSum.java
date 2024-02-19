package DataStructure.Arrays;

import java.util.List;

/**
 * Created by RaedMassoud on 2/19/2024
 * Project: HackerRank-Solutions
 */
public class HourGlassSum {

    public static int hourglassSum(List<List<Integer>> arr) {

        // get row and column size
        int row = arr.size();
        int column = arr.get(0).size();

        // set max to minimum
        int maxHourGlassSum = Integer.MIN_VALUE;

        // traverse
        for(int i = 0; i < row-2; i++) {

            for(int j = 0; j < column-2; j++) {

                int currentSum = arr.get(i).get(j) + arr.get(i).get(j+1) +
                        arr.get(i).get(j+2) + arr.get(i+1).get(j+1) +
                        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +
                        arr.get(i+2).get(j+2);

                // update max
                maxHourGlassSum = Math.max(currentSum, maxHourGlassSum);
            }

        }
        // return max
        return maxHourGlassSum;
    }
}
