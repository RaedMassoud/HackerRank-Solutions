package Strings;

import java.util.Arrays;
import java.util.Locale;

/**
 * Created by RaedMassoud on 2/17/2024
 *
 * @author: RaedMassoud
 * @date: 2/17/2024
 * @project: HackerRank-Solutions
 */
public class Pangram {

    // Checks if a String contains all letters of the alphabet
    public static String pangrams(String s) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        // convert the string into a lower case sorted array of characters
        s = s.toLowerCase();
        char[] result = s.toCharArray();
        Arrays.sort(result);


        // Traverse the array
        int j = 0;
        for(int i = 0; i < result.length; i++) {

            // if current letter matches alpha move to then next letter and increment the pointer
            if(Character.toLowerCase(result[i]) == alpha.charAt(j))
                j++;

            // 26 diff letters found
            if(j == 26)
                return "pangram";
        }

        // return false
        return "not pangram";
    }

}
