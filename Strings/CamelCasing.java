package Strings;

/**
 * Created by RaedMassoud on 2/16/2024
 *
 * @author: RaedMassoud
 * @date: 2/16/2024
 * @project: Murex Practice
 */
public class CamelCasing {

    public static int camelcase(String s) {

        int wCount = 1;
        char current;

        // Traverse the string
        for(int i = 0; i < s.length(); i++) {
            current = s.charAt(i); // set current character

            // If character is upper case increment word count
            wCount += Character.isUpperCase(current)? 1 : 0;
        }

        return wCount;

    }
}
