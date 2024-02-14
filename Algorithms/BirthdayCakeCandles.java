package Algorithms;

import java.util.List;

/**
 * Created by RaedMassoud on 2/14/2024
 *
 * @author: RaedMassoud
 * @date: 2/14/2024
 * @project: HackerRank-Solutions
 */
public class BirthdayCakeCandles {

    // This method traverses an array and return the count of the largest number found
    // The numbers in our array represent candle heights
    public int birthdayCakeCandles(List<Integer> candles) {

        int tallest = 0;
        int count = 0;

        // Traverse the array
        for(int i = 0; i < candles.size(); i++) {

            // If a greater height is found assign it to tallest and reset count
            if(candles.get(i) > tallest) {
                tallest = candles.get(i);
                count = 1;
            }
            // If the tallest height is found again increment the counter
            else if(candles.get(i) == tallest){
                count++;
            }
        }

        // Return the count
        return count;
    }


}
