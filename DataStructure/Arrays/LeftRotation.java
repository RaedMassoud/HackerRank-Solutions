package DataStructure.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RaedMassoud on 2/19/2024
 * Project: HackerRank-Solutions
 */
public class LeftRotation {

    // Rotate elements in an array by a factor of K to the left
    public List<Integer> rotateLeft(List<Integer> arr, int k) {

        // Optimal - final shifting factor
        k %= arr.size();

        // Temporary list to store first k elements
        List<Integer> temp = new ArrayList<>();

        // store first k elements
        for(int i = 0; i < k; i++)
            temp.add(arr.get(i));

        // shift {k, arr.size} elements by k factor
        for(int i = 0; i < arr.size() - k; i++)
            arr.set(i, arr.get(i + k));

        // add stored elements to the end of the array
        for(int i = arr.size() - k, j = 0; i < arr.size(); i++) {
            arr.set(i, temp.get(j));
            j++;
        }

        return arr;
    }

}
